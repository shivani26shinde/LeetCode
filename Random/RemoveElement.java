// Remove element

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int start=0;
        int end=0;
        int i=0;
        while(i<nums.length){
            if(nums[i] == val){
                a=i;
                b=i;
                i++;
                while(i<nums.length && nums[i] == val){
                    b=i;
                    i++;
                }
                break;
            }
            i++;
        }
    }
}