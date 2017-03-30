# Numbers disappeared in an array

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 0){
            return list;
        }
        int i=0;
        while(i<nums.length){
            if(nums[i] == i+1 || nums[i] == -1){
                i++;
            }
            else{
                if(nums[nums[i]-1] != nums[i]){
                    int temp = nums[nums[i]-1];
                    nums[nums[i]-1] = nums[i];
                    nums[i] = temp;
                }
                else{
                    nums[nums[i]-1] = nums[i];
                    nums[i] = -1;
                    i++;
                }
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] == -1){
                list.add(j+1);
            }
        }
        return list;
    }
}