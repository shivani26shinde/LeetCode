# Longest common prefix

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        if(strs.length == 0){
            return "";
        }
        for(int i=0;i<strs.length;i++){
            min = Math.min(min, strs[i].length());
        }
        if(min == 0){
            return "";
        }
        for(int i=0;i<min;i++){
            for(int j=0;j<strs.length-1;j++){
                String s1 = strs[j];
                String s2 = strs[j+1];
                if(s1.charAt(i) != s2.charAt(i)){
                    return s1.substring(0, i);
                }
            }
        }
        return strs[0].substring(0, min);
    }
}
