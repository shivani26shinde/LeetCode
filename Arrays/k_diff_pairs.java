# k-different pairs in an array

public class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0){
            return 0;
        }
		
		// Only unique values will be stored
        Set<Integer> temp = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
		
        for(int i=0;i<nums.length;i++){		
			// ans will contain all the elements
            if(ans.contains(nums[i]+k)){
				// temp will contain one value of the unique pair 
                temp.add(nums[i]);
            }
            if(ans.contains(nums[i]-k)){
                temp.add(nums[i]-k);
            }
            ans.add(nums[i]);
        }
		// size of temp will have the total count
        return temp.size();
    }
}