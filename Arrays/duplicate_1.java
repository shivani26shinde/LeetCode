# Contains duplicate 1

public class Solution {
    public boolean containsDuplicate(int[] nums) {
	
		// Single element or empty array
		if(nums.length < 2){
			return false;
		}

		HashMap<Integer, Integer> map = new HashMap<>();

		// Iterate till the end
		for(int i=0;i<nums.length;i++){
		
			// Checks if the value exits in the hashset
			if(map.containsKey(nums[i])){
			   return true;
			}
			map.put(nums[i],i);
		}
		return false;
    }
}