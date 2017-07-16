# First missing positive

public class Solution {
    public int firstMissingPositive(int[] nums) {
     HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                set.add(nums[i]);
            }
        }
        if(set.isEmpty()){
            return 1;
        }
        int max = 1;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
        }
        for(int i=1;i<=max;i++){
            if(!set.contains(i)){
                return i;
            }
            set.remove(i);
        }
        return max+1; 
    }
}