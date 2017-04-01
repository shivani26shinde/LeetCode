# Sum of two numbers in a sorted array

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
		
		// Less than two elements
        if(numbers.length < 2){
            return arr;
        }
		
		// Map to store the elements and the position of the elements
        HashMap<Integer, Integer> maps = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            maps.put(numbers[i], i);
        }
		
		// Checks if sum of two numbers equals to the target
        for(int i=0;i<numbers.length;i++){
            if(maps.containsKey(target - numbers[i])){
                int val = maps.get(target - numbers[i]);
                if(i<val){
                    arr[0] = i+1;
                    arr[1] = val+1;
                }
            }
        }
        return arr;
    }
}