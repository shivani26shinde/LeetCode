// Last word length

public class lastWordLen {
    public int lengthOfLastWord(final String A) {
        int len = A.length();
        if(len<=1){
            return len;
        }
        int i=len-1;
        while(i>=0){
            if(A.charAt(i) == ' '){
                i--;
            }
            else{ 
                int fLen = 0;
                while(i>=0 && A.charAt(i) != ' '){
                    fLen++;
                    i--;
                }
                return fLen;
            }
        }
        return 0;
    }
}
