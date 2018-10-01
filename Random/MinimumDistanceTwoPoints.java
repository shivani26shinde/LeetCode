// Minimum distance

import java.util.*;
import java.lang.*;
import java.io.*;

class MinimumDistanceTwoPoints
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int m=4,n=4;
		char[][] grid = { { '0', '0', '0', '0' }, 
	                      { '0', '0', '0', '0' }, 
	                      { '0', '0', '0', '0' }, 
	                      { '0', '0', 'X', '0' } }; 
	    int dist = minDist(grid);
	    System.out.println(dist);
  
	}
	public static int minDist(char[][] grid){
		int m = grid.length;
		int n = grid[0].length;
		boolean[][] visited = new boolean[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				visited[i][j] = false;
			}
		}
		Item item = new Item(0,0,0);
		Queue<Item> q = new LinkedList<Item>();
		q.add(item);
		visited[item.row][item.col] = true;
		while(!q.isEmpty()){
			item = q.remove();
			if(grid[item.row][item.col] == 'X'){
				return item.dist;
			}
			//Up
			if(item.row-1>=0 && visited[item.row-1][item.col] == false){
				q.add(new Item(item.row-1, item.col, item.dist+1));
				visited[item.row-1][item.col] = true;
			}
			//Down
			if(item.row+1<m && visited[item.row+1][item.col] == false){
				q.add(new Item(item.row+1, item.col, item.dist+1));
				visited[item.row+1][item.col] = true;
			}
			//Left
			if(item.col-1>=0 && visited[item.row][item.col-1] == false){
				q.add(new Item(item.row, item.col-1, item.dist+1));
				visited[item.row][item.col-1] = true;
			}
			//Right
			if(item.col+1<n && visited[item.row][item.col+1] == false){
				q.add(new Item(item.row, item.col+1, item.dist+1));
				visited[item.row][item.col+1] = true;
			}
		}
		return -1;
	}
}
class Item{
	int row;
	int col;
	int dist;
	public Item(int row, int col, int dist){
		this.row = row;
		this.col = col;
		this.dist = dist;
	}
}