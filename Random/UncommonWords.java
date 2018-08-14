// Uncommon words in two sentences

class UncommonWords {
    public String[] uncommonFromSentences(String A, String B) {
        ArrayList<String> list = new ArrayList<>();
        String[] StringA = A.split(" ");
        String[] StringB = B.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<StringA.length;i++){
            if(map.containsKey(StringA[i])){
                int val = map.get(StringA[i]);
                map.put(StringA[i],val+1);
            }
            else{
                map.put(StringA[i],1);
            }
        }
        for(int i=0;i<StringB.length;i++){
            if(map.containsKey(StringB[i])){
                int val = map.get(StringB[i]);
                map.put(StringB[i],val+1);
            }
            else{
                map.put(StringB[i],1);
            }
        }
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                list.add(s);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}