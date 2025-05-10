/*
9. Write a Java program to find numbers less than 7 in a tree set.
 */

package treeset.practice1.pkg;

import java.util.TreeSet;

public class Question9 
{
	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet();
		t1.add(20);
		t1.add(3);
		t1.add(8);
		t1.add(15);
		t1.add(6);
		t1.add(35);
		t1.add(4);
		t1.add(2);
		
		System.out.println(t1);
		System.out.println(t1.headSet(7));
		
	}
}
