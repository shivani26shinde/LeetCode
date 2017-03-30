# Max consecutive one's

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int max = 0;
        int i=0;
        while(i<nums.length){
            if(nums[i] == 0){
                i++;
            }
            else{
                int val = 0;
                while(i<nums.length && nums[i] == 1){
                    val++;
                    i++;
                }
                max = Math.max(max,val);
            }
        }
        return max;
    }
}