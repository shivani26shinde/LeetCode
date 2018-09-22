// Sorry Array by Parity

class ArrayParity {
    public int[] sortArrayByParity(int[] A) {
        if(A.length <= 1){
            return A;
        }
        int odd = 0;
        int even = 1;
        while(even < A.length){
            if(A[odd]%2 == 1 && A[even]%2 == 1){
                even++;
            }
            else if(A[odd]%2 == 1 && A[even]%2 == 0){
                int temp = A[odd];
                A[odd] = A[even];
                A[even] = temp;
                odd++;
                even++;
            }
            else{
                odd++;
                even++;
            }
        }
        return A;
    }
}