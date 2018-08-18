// Binary Gap

class BinaryGap {
    public int binaryGap(int N) {
        int gap=0;
        int foundGap=0;
        for(int i=0;N>0;N/=2){
            if(N%2 == 1){
                i++;
            }
            else{
                if(i>gap && foundGap==1){
                    gap=i;
                }
                foundGap=1;
                i=0;
            }
        }
        return gap;
    }
}