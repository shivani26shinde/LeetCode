# Plus one to the value

public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 1;
		
		// Add 1 from the end of the array
        while(i >= 0 && carry == 1){
            list.add((digits[i]+carry)%10);
            carry = (digits[i]+carry)/10;
            i--;
        }
		// Add last carry
        if(carry == 1){
            list.add(carry);
        }
		
		// Add other numbers from the array
        while(i >= 0){
            list.add(digits[i]);
            i--;
        }
        int[] array = new int[list.size()];
        int k=0;
		
		// Copy list elements into the array
        for(int j=list.size()-1;j>=0;j--){
            array[k] = list.get(j);
            k++;
        }
        return array;
    }
}