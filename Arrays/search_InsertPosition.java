# Search Insert-Position

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
		
		// Iterate till the end
        while(i<nums.length){
			
			// Move to the next value
            if(nums[i] < target){
                i++;
            }
			// Return current position
            else{
                return i;
            }
        }
		// Target element greater than all the elements
        return nums.length;
    }
}