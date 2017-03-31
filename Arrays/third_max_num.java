# Third maximum number

public class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
		
		// First maximum number
        for(int i=0;i<nums.length;i++){
            if(max1 < nums[i]){
                max1 = nums[i];
            }
        }
		
		// Second maximum number
        for(int i=0;i<nums.length;i++){
            if(max2 < nums[i] && nums[i] < max1){
                max2 = nums[i];
            }
        }
		
		// Counter to check if there exists a third maximum number
        int c = 0;
		
		// Third maximum number
        for(int i=0;i<nums.length;i++){
            if(max3 <= nums[i] && nums[i] < max2){
                max3 = nums[i];
                c++;
            }
        }
		
		// No third maximum number
        if(c == 0){
            return max1;
        }
        return max3;
    }
}