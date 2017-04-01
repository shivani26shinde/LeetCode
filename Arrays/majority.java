# Majority element

public class Solution {
    public int majorityElement(int[] nums) {
	
		// Single number
        if(nums.length == 1){
            return nums[0];
        }
        int div = nums.length/2;
        int ans = 0;
		
		// Counts the occurances
        HashMap<Integer, Integer> maps = new HashMap<>();
		
		// Iterate through the array
        for(int i=0;i<nums.length;i++){
		
			// Increments the counter
            if(maps.containsKey(nums[i])){
                int val = maps.get(nums[i]);
				
				// More than half
                if(val+1 > div){
                    ans = nums[i];
                    break;
                }
                maps.put(nums[i], val+1);
                
            }
			// Adds to the map
            else{
                maps.put(nums[i], 1);
            }
        }
        return ans;
    }
}