# Hamming distance

public class Solution {
    public int hammingDistance(int x, int y) {
        int val = x ^ y;  
        int count = 0;  
        for (int i = 0; i < 32; i++) {  
            if ((val & 1) != 0)  
                count++;  
            val >>= 1;  
        }  
        return count;
    }
}