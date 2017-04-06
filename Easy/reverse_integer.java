# Reverse Integer

public class Solution {
    public int reverse(int x) {
        int val = 0;
		
		// Iterate till the dividend is not 0
        while(x != 0){
            if(val > Integer.MAX_VALUE/10 || val < Integer.MIN_VALUE/10){
                return 0;
            }
            else{
                val = 10*val + x%10;
                x = x/10;
            }
        }
        return val;
    }
}