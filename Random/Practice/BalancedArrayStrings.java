import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedArrayStrings {

    // Complete the braces function below.
    static String[] braces(String[] values) {
        String[] finalString = new String[values.length];
        for(int i=0;i<values.length;i++){
            String str = values[i];
            Stack<Character> st = new Stack<Character>();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '[' || str.charAt(j) == '(' || str.charAt(j) == '{'){
                    st.push(str.charAt(j));
                }
                else{
                    if(!st.isEmpty()){
                        if(str.charAt(j) == ']' && st.peek() == '['){
                            st.pop();
                        }
                        else if(str.charAt(j) == ')' && st.peek() == '('){
                            st.pop();
                        }
                        else if(str.charAt(j) == '}' && st.peek() == '{'){
                            st.pop();
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        st.push(str.charAt(j));
                    }
                }
            }
            if(st.isEmpty()){
                finalString[i] = "YES";
            }
            else{
                finalString[i] = "NO";
            }
        }
        return finalString;
    }

    private static final Scanner scanner = new Scanner(System.in);