// Remove duplicates from sorted array

class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int start = 0;
        int end = 1;
        int pos = 0;
        while(start < nums.length && end < nums.length){
            if(nums[start] != nums[end]){
                nums[pos] = nums[start];
                start = end;
                pos++;
            }
            end++;
        }
        if(start < nums.length){
            nums[pos] = nums[start];
        }
        return pos+1;
    }
}