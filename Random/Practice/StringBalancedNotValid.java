import java.util.*;
import java.lang.*;
import java.io.*;

class StringBalancedNotValid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "{}}}[[]({){{([])[}]}}{{]";
		HashMap<Character, Integer> map = new HashMap<>();
		if(s.length() <= 1){
			System.out.println("It is valid and balanced");
		}
		else{
			for(int i=0;i<s.length();i++){
				char c = s.charAt(i);
				if(c == '[' || c == '{' || c == '('){
					if(map.containsKey(c)){
						map.put(c, map.get(c) + 1);
					}
					else{
						map.put(c, 1);
					}
				}
				else{
					if(c == ']'){
						if(map.containsKey('[')){
							map.put('[', map.get('[') - 1);
							if(map.get('[') == 0){
								map.remove('[');
							}
						}
						else{
							if(map.containsKey(c)){
								map.put(c, map.get(c) + 1);
							}
							else{
								map.put(c, 1);
							}
						}
					}
					else if(c == '}'){
						if(map.containsKey('{')){
							map.put('{', map.get('{') - 1);
							if(map.get('{') == 0){
								map.remove('{');
							}
						}
						else{
							if(map.containsKey(c)){
								map.put(c, map.get(c) + 1);
							}
							else{
								map.put(c, 1);
							}
						}
					}
					else if(c == ')'){
						if(map.containsKey('(')){
							map.put('(', map.get('(') - 1);
							if(map.get('(') == 0){
								map.remove('(');
							}
						}
						else{
							if(map.containsKey(c)){
								map.put(c, map.get(c) + 1);
							}
							else{
								map.put(c, 1);
							}
						}
					}
				}
			}
			if(map.size() == 0){
				System.out.println("It is valid and balanced");
			}
			else{
				System.out.println("It is not valid or balanced");
			}
		}
	}
}

// An update

import java.util.*;
import java.lang.*;
import java.io.*;

class StringBalancedNotValid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "{}}}[[]({){{([])[}]}}{{]";
		HashMap<Character, Integer> map = new HashMap<>();
		boolean flag = true;
		if(s.length() <= 1){
			System.out.println("It is valid and balanced");
		}
		else{
			for(int i=0;i<s.length();i++){
				char c = s.charAt(i);
				if(c == '[' || c == '{' || c == '('){
					if(map.containsKey(c)){
						map.put(c, map.get(c) + 1);
					}
					else{
						map.put(c, 1);
					}
				}
				else{
					if(c == ']'){
						if(map.containsKey('[')){
							map.put('[', map.get('[') - 1);
							if(map.get('[') == 0){
								map.remove('[');
							}
						}
						else{
							System.out.println("It is not valid or balanced");
							flag = false;
							break;
						}
					}
					else if(c == '}'){
						if(map.containsKey('{')){
							map.put('{', map.get('{') - 1);
							if(map.get('{') == 0){
								map.remove('{');
							}
						}
						else{
							System.out.println("It is not valid or balanced");
							flag = false;
							break;
						}
					}
					else if(c == ')'){
						if(map.containsKey('(')){
							map.put('(', map.get('(') - 1);
							if(map.get('(') == 0){
								map.remove('(');
							}
						}
						else{
							System.out.println("It is not valid or balanced");
							flag = false;
							break;
						}
					}
				}
			}
			if(flag == true){
				System.out.println("It is valid and balanced");
			}
		}
	}
}