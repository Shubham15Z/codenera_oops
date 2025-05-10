/*
6. Write a Java program to clone a tree set list to another tree set.
 */

package treeset.practice1.pkg;

import java.util.TreeSet;

public class Question6 
{
	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet();
		t1.add(20);
		t1.add(30);
		t1.add(80);
		t1.add(15);
		t1.add(60);
		t1.add(35);
		t1.add(40);
		t1.add(55);
		
		TreeSet t2 = (TreeSet)t1.clone();
		System.out.println(t2);
		
	}
}
