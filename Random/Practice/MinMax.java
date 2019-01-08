import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            sum = sum+arr[i];
        }
        int ans1 = sum-max;
        int ans2 = sum-min;
        System.out.println(ans1+" "+ans2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
