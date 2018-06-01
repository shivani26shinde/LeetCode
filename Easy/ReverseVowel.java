// Leetcode --> Q.345 --> Reverse Vowel

class ReverseVowel {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        int start = 0;
        int end = s.length()-1;
        char a = '\0';
        char b = '\0';
        while(end>start){
            if(set.contains(s.charAt(start))){
                a = s.charAt(start);
            }
            else{
                start++;
            }
            if(set.contains(s.charAt(end))){
                b = s.charAt(end);
            }
            else{
                end--;
            }
            if(a != '\0' && b != '\0'){
                StringBuilder sb = new StringBuilder(s);
                sb.setCharAt(start, s.charAt(end));
                sb.setCharAt(end, s.charAt(start));
                s = sb.toString();
                a = '\0';
                b = '\0';
                start++;
                end--;
            }
        }
        return s;
    }
}