# Palindrome string

public class Solution {
    public boolean isPalindrome(String s) {
        String g = s.replaceAll("[^a-zA-Z0-9]", "");
        g = g.toLowerCase();
        int len = g.length();
        int i=0;
        int j=len-1;
        while(i<j){
            if(g.charAt(i) != g.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}