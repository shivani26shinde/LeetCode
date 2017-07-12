# Length of the last word

public class Solution {
    public int lengthOfLastWord(String s) {
        int i=0;
        int var=0;
        s = s.trim();
        while(i<s.length()){
            if(s.charAt(i) != ' '){
                var++;
            }
            else{
                var = 0;
            }
            i++;
        }
        return var;
    }
}