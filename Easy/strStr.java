# Implement StrStr()

public class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if(l1 == 0 && l2 == 0){
            return 0;
        }
        if(l1<l2){
            return -1;
        }
        if(l1 == 0 || l2 == 0){
            return 0;
        }
        for(int i=0; i<l1; i++){
            while(i+l2 > l1){
                return -1;
            }
            int temp = i;
            for(int j=0; j<l2; j++){
                if(needle.charAt(j)==haystack.charAt(temp)){
                    if(j==needle.length()-1){
                        return i;   
                    }
                    temp++;
                }
                else{
                    break;
                }
     
            }
        }
        return -1;
    }
}