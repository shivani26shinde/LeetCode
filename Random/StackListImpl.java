//Stack implementation using arraylist

import java.util.*;
import java.lang.*;
import java.io.*;

class StackListImpl
{
	ArrayList<Integer> list = new ArrayList<>();
	public static void main (String[] args) throws java.lang.Exception
	{
		StackListImpl id = new StackListImpl();
		for(int i=0;i<=10;i++){
			id.push(i);
		}
		for(int i=0;i<=6;i++){
			id.pop();
		}
		id.display();
	}
	private void push(int val){
		list.add(val);
	}
	private void pop(){
		if(list.size() == 0){
			System.out.println("Stack is empty");
			return;
		}
		list.remove(list.size()-1);
	}
	private void display(){
		if(list.size() == 0){
			System.out.println("Stack is empty");
			return;
		}
		for(int i=list.size()-1;i>=0;i--){
			System.out.println(list.get(i)+"  ");
		}
	}
}