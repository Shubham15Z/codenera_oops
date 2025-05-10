/*
3. Write a Java program to add all the elements of a specified tree set to another tree set.
 */

package treeset.practice1.pkg;

import java.util.TreeSet;

public class Question3 
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
		
		System.out.println(t1);
		TreeSet t2 = new TreeSet();
		t2.addAll(t1);
		System.out.println(t2);
	}
}
