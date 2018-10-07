// Reverse string

public class reverseString {
    public String reverseWords(String a) {
        int len = a.length();
        if(len <= 1){
            return a;
        }
        String str = "";
        int i=len-1;
        while(i>=0){
            if(a.charAt(i) == ' '){
                i--;
            }
            else{
                int j=i;
                while(i>=0 && a.charAt(i) != ' '){
                    i--;
                }
                if(i > -1){
                    str = str + a.substring(i+1, j+1) + ' ';
                }
                else{
                    str = str + a.substring(i+1, j+1);
                }
            }
        }
        return str;
    }
}
