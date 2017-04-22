# Word Pattern

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null && str == null){
            return true;
        }
        if(pattern == null && str != null){
            return false;
        }
        if(pattern != null && str == null){
            return false;
        }
        String[] spt = str.split("\\s+");
        if(pattern.length() != spt.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(spt[i])){
                    return false;
                }
            }
            else if (map.containsValue(spt[i])){
                return false;
            }
            map.put(pattern.charAt(i), spt[i]);
        }
        return true;
    }
}
