/*
1. Write a Java program to append the specified element to the end of a linked list.
 */

package linkedlist.practice.pkg;

import java.util.LinkedList;

public class Question1 
{
	public static void appendElement()
	{
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		System.out.println(l1);
		
		l1.addLast(100);
		
		System.out.println(l1);
	}
	
	public static void main(String[] args) 
	{
		appendElement();
	}
}
