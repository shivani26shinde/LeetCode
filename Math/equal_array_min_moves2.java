# Equal the array elements in minimum moves

public class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
		
		// Dynamic programming
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i-1] + count;
            nums[i] += count;
            count += diff;
        }
        return count;
    }
}