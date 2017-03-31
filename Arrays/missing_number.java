# Missing number

public class Solution {
    public int missingNumber(int[] nums) {
	
		// Empty array
        if(nums.length == 0){
            return 0;
        }
        int i=0;
		
		// Iterate till the end
        while(i<nums.length)
        {
			// Element at its correct position
            if(nums[i] == i){
                i++;
            }
            else{
			
				// Places the element at its correct position
               if(nums[i] < nums.length){
                    int temp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = temp;
                }
				// Element equal to the array length
                else{
                    i++;
                }
            }
        }
		
		// Check for the missing element
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j){
                return j;
            }
        }
		
		// Length of the array is the missing element
        return nums.length;
    }
}