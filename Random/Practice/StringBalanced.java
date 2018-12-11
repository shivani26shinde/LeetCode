/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class StringBalanced
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "{}[[]](){{{([])}}}";
		Stack<Character> st = new Stack<>();
		if(s.length() <= 1){
			System.out.println("It is valid and balanced");
		}
		else{
			for(int i=0;i<s.length();i++){
				if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
					st.push(s.charAt(i));
				}
				else{
					if(st.isEmpty()){
						st.push(s.charAt(i));
					}
					else{
						if(s.charAt(i) == ']' && st.peek() == '['){
							st.pop();
						}
						else if(s.charAt(i) == '}' && st.peek() == '{'){
							st.pop();
						}
						else if(s.charAt(i) == ')' && st.peek() == '('){
							st.pop();
						}
					}
				}
			}
			if(st.isEmpty()){
				System.out.println("It is valid and balanced");
			}
			else{
				System.out.println("It is not valid or balanced");
			}
		}
	}
}