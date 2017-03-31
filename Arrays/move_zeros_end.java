# Move zeros to the end

public class Solution {
    public void moveZeroes(int[] nums) {
	
		// Single or no element
        if(nums.length < 2){
            return;
        }
		
		// Keep two pointers to swap
        int i = 0;
        int j = 1;
		
		// Iterate till the end
        while(j<nums.length){
		
			// Increment till a zero is found
            if(nums[i] != 0){
               i++;
               j++;
            }
            else{
				// Increment till a non-zero element is found
                while(j<nums.length && nums[j] == 0){
                    j++;
                }
				// Swap the two elements
                if(j < nums.length){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j++;
                }
            }
        }
        return;
    }
}