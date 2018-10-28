//Binary Search Tree

import java.util.*;
import java.lang.*;
import java.io.*;

class BST
{
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	public static void main (String[] args) throws java.lang.Exception
	{
		BST id = new BST();
		System.out.println(id.BST(6));
	}
	private int BST(int val){
		if(list.size() == 0){
			return -1;	
		}
		int start = 0;
		int end = list.size()-1;
		while(end > start){
			int mid = (start+end)/2;
			int num = list.get(mid);
			if(num == val){
				return mid;
			}
			if(num < val){
				start = mid+1;
			}
			else{
				end = mid;
			}
		}
		return start;
	}
}