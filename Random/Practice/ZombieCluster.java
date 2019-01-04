import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class ZombieCluster {

    /*
     * Complete the 'zombieCluster' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY zombies as parameter.
     */
 
    public static void Traverse(int i, int j, int row, int col, List<String> zombies, int[][] visited){
        if(i<0 || i>=row || j<0 || j>= col){
            return;
        }
        if(visited[i][j] == 1){
            return;
        }
        visited[i][j] = 1;
        if (zombies.get(i).charAt(j) == '0') {
            return;
        }
        Traverse(i - 1, j, row, col, zombies, visited);
        Traverse(i, j - 1, row, col, zombies, visited);
        Traverse(i+1, j, row, col, zombies, visited);
        Traverse(i, j+1, row, col, zombies, visited);
        return;
    }
    public static int zombieCluster(List<String> zombies) {
        
        int row = zombies.size();
        if(row == 0){
            return 0;
        }
        int col = zombies.get(0).length();
        int[][] visited = new int[row][col];
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(zombies.get(i).charAt(j) == '1' && visited[i][j] != 1){
                    Traverse(i, j, row, col, zombies, visited);
                    count++;
                }
            }
        }
        return count;
    }

}
