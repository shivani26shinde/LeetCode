# Perfect Number

public class Solution {
    public boolean checkPerfectNumber(int num) {
	
		// Number is less than 2
        if(num < 2){
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
		
		// Find all divisors till square-root of the given number
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                list.add(i);
                int next = num/i;
                if(next != i && next != num){
                    list.add(next);
                }
            }
        }
        int val = 0;
		
		// Sum of all divisors
        for(int i=0;i<list.size();i++){
            val = val+list.get(i);
        }
		
		//Sum equals to the given number
        if(val == num){
            return true;
        }
        return false;
    }
}