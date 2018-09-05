// Is Monotonic

class Monotonic {
    public boolean isMonotonic(int[] A) {
        int inc = 0;
        int dec = 0;
        for(int i=1;i<A.length;i++){
            if(A[i] > A[i-1]){
                inc = 1;
            }
            else if(A[i] < A[i-1]){
                dec = 1;
            }
            if(inc == 1 && dec ==1){
                return false;
            }
        }
        return true;
    }
}