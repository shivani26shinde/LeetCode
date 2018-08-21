// Fair Candy Swap

class CandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        ArrayList<Integer> list = new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<A.length;i++){
            sum1 = sum1+A[i];
        }
        for(int i=0;i<B.length;i++){
            sum2 = sum2+B[i];
        }
        int start1=A.length-1;
        int start2=B.length-1;
        while(sum1 != sum2 && start1 >= 0 && start2 >= 0){
            int val1 = A[start1];
            int val2 = B[start2];
            sum1 = sum1-val1;
            sum2 = sum2-val2;
            sum1 = sum1+val2;
            sum2 = sum2+val1;
            list.add(val1);
            list.add(val2);
            start1--;
            start2--;
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}