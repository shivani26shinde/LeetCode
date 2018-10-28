//Stack implementation using array

import java.util.*;
import java.lang.*;
import java.io.*;

class StackArrayImpl
{
	int size = 0;
	int[] arr = new int[10];
	public static void main (String[] args) throws java.lang.Exception
	{
		StackArrayImpl id = new StackArrayImpl();
		for(int i=0;i<=10;i++){
			id.push(i);
		}
		for(int i=0;i<=10;i++){
			id.pop();
		}
		id.display();
	}
	private void push(int val){
		if(size >= arr.length){
			System.out.println("Stack is full");
			return;
		}
		arr[size] = val;
		size++;
	}
	private void pop(){
		if(size == 0){
			System.out.println("Stack is empty");
			return;
		}
		arr[size-1] = 0;
		size--;
	}
	private void display(){
		if(size == 0){
			System.out.println("Stack is empty");
			return;
		}
		for(int i=size-1;i>=0;i--){
			System.out.println(arr[i]+"  ");
		}
	}
}