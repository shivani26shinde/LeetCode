# Rotate array by k

public class Solution {
    public void rotate(int[] nums, int k) {
	
		// Less than 2 elements
        if(nums.length < 2){
            return;
        }
		
		// No rotation
        if(k == 0){
            return;
        }
        int l = nums.length;
        int diff = k%l;
        int start = l - diff;
		
		// New array
        int[] t1 = new int[l];
        int j=0;
		
		// Copy elements from previous array to new array at desired location
        for(int i=start;i<l;i++){
            t1[j] = nums[i];
            j++;
        }
		
		// Copy elements from previous array to new array at desired location
        for(int i=0;i<start;i++){
            t1[j] = nums[i]; 
            j++;
        }
		
		// Copy all elements from new array to previous array
        for(int i=0;i<l;i++){
            nums[i] = t1[i];
        }
        return;
    }
}