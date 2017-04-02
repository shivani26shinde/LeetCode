# Maximum subarray (Kadane's algorithm)
# Complexity: O(n)

public class Solution {
    public int maxSubArray(int[] nums) {
        int[] max = new int[nums.length];
		
		// Single element in the array
        if(nums.length == 1){
            return nums[0];
        }
        max[0] = nums[0];
		
		// Maximum value at respective place
        for(int i=1;i<nums.length;i++){
            max[i] = Math.max(nums[i], nums[i]+max[i-1]);
        }
        int highest = max[0];
		
		// Overall maximum subarray value
        for(int i=1;i<max.length;i++){
            if(highest < max[i]){
                highest = max[i]; 
            }
        }
        return highest;
    }
}