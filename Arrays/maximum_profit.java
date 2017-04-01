# Maximum profit (buying and selling)

public class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
		
		// Less than 2 days
        if(l < 2){
            return 0;
        }
        int[][] array = new int[l][l];
		
		// Iterate till the end
        for(int i=1;i<l;i++){
		
			// Initialize maximum difference
            int max1 = -prices[0];
            for(int j=1;j<l;j++){
                array[i][j] = Math.max(prices[j] + max1, array[i][j-1]);
				
				// Get the maximum difference, wil be used in the next iteration
                max1 = Math.max(max1, array[i-1][j]-prices[j]);
            }
        }
		
		// Last value
        return array[l-1][l-1];
    }
}