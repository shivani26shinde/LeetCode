# Equal the array elements in minimum moves

public class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
		
		// Sum of difference between every other element and 1st element
        for (int i = nums.length - 1; i > 0; i--) {
            count += nums[i] - nums[0];
        }
        return count;
    }
}