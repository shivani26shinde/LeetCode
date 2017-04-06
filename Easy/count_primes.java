# Count primes

public class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        int count = 0;
		
		// Set all flags to 1 i.e. prime
        int[] flag = new int[n+1];
        for(int i=1;i<n;i++){
            flag[i] = 1;
        }
		
		// Set all flags of multiples to 0 i.e. non-prime
        for(int i=2;i<n;i++){
            if(flag[i] == 1){
               for(int j=2*i;j<n;j=j+i){
                    flag[j] = 0;
               }
                
            }
        }
		
		// Count the non-prime flags
        for(int i=2;i<n;i++){
            if(flag[i] == 1){
                count++;
            }
        }
        return count;
    }
}