# Sort colors

public class Solution {
    public void sortColors(int[] nums) {
        int[] val = nums.clone();
        int s = 0;
        for(int i=0;i<val.length;i++){
            if(val[i] == 0){
                nums[s] = 0;
                s++;
            }
        }
        for(int i=0;i<val.length;i++){
            if(val[i] == 1){
                nums[s] = 1;
                s++;
            }
        }
        for(int i=0;i<val.length;i++){
            if(val[i] == 2){
                nums[s] = 2;
                s++;
            }
        }
    }
}