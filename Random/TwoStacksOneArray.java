//Two stacks implemented using one array

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TwoStacksOneArray
{
	int size1 = 0;
	int size2 = 9;
	int[] arr = new int[10];
	public static void main (String[] args) throws java.lang.Exception
	{
		TwoStacksOneArray id = new TwoStacksOneArray();
		for(int i=0;i<=3;i++){
			id.push1(i);
		}
		for(int i=0;i<=7;i++){
			id.push2(i);
		}
		id.pop1();id.pop2();
		id.display();
	}
	private void push1(int val){
		if(size1 > size2){
			System.out.println("Stack1 is full");
			return;
		}
		arr[size1] = val;
		size1++;
	}
	private void push2(int val){
		if(size2 < size1){
			System.out.println("Stack2 is full");
			return;
		}
		arr[size2] = val;
		size2--;
	}
	private void pop1(){
		if(size1 == 0){
			System.out.println("Stack1 is empty");
			return;
		}
		arr[size1-1] = 0;
		size1--;
	}
	private void pop2(){
		if(size2 == 9){
			System.out.println("Stack2 is empty");
			return;
		}
		arr[size2+1] = 0;
		size2++;
	}
	private void display(){
		if(size1 == 0){
			System.out.println("Stack1 is empty");
			return;
		}
		if(size2 == 9){
			System.out.println("Stack2 is empty");
			return;
		}
		for(int i=size1-1;i>=0;i--){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		for(int i=size2+1;i<=9;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}