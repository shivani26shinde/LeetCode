# Longest substring without any repeated values

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                if(max<set.size()){
                    max = set.size();
                }
            }
            else{
                set = new HashSet<>();
                set.add(s.charAt(i));
            }
        }
        return max;
    }
}
