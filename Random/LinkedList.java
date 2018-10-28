//LinkedList

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	Node head; 
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone id = new Ideone();
		id.insert(1);id.insert(2);id.insert(3);id.insert(4);id.insert(5);
		id.print();
		id.delete(1);
		id.delete(5);
		id.print();
	}
	private void insert(int val){
		if(head == null){
			head = new Node(val);
			return;
		}
		Node node = new Node(val);
		Node curr = head;
		while(curr != null && curr.next != null){
			curr = curr.next;
		}
		curr.next = node;
		return;
	}
	private void delete(int val){
		if(head == null){
			return;
		}
		Node curr = head;
		if(curr.val == val){
			head = curr.next;
			return;
		}
		Node prev = head;
		while(curr != null){
			if(curr.val == val){
				prev.next = curr.next;
				return;
			}
			prev = curr;
			curr = curr.next;
		}
		System.out.println("Element not found");
	}
	private void print(){
		Node curr = head;
		while(curr != null){
			System.out.print(curr.val+"  ");
			curr = curr.next;
		}
		System.out.println();
		return;
	}
}
class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
	}
}