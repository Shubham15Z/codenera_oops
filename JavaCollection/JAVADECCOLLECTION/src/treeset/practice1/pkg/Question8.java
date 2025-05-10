/*
8. Write a Java program to compare two tree sets.
 */

package treeset.practice1.pkg;

import java.util.TreeSet;

public class Question8
{
	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet();
		t1.add(20);
		t1.add(30);
		t1.add(80);
		t1.add(15);
		System.out.println(t1);
		
		TreeSet t2 = new TreeSet();
		t2.add(60);
		t2.add(35);
		t2.add(40);
		t2.add(55);
		System.out.println(t2);
		
		System.out.println(t1.equals(t2));
	}
}
