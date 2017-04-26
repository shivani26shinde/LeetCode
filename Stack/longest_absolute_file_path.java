# Longest Absolute file path

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		Stack st = new Stack();
		String[] array = s.split("\n");
		int ans = 0;
		for(int i=0;i<array.length;i++){
			String temp = array[i];
			int level = temp.lastIndexOf("\t") + 1;
			while(level != st.size()){
				st.pop();
			}
			int len = temp.length() - level;
			if(st.isEmpty()){
				st.push(len);
			}
			else{
				st.push((int) st.peek() + len+ 1);
			}
			if(s.contains("i")){
				ans = Math.max(ans, (int) st.peek());
			}
		}
		System.out.println(ans);
	}
}