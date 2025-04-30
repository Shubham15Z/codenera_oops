/*
 1. Write a Java program to append the specified element to the end of a hash set.
 */

package hashset.pkg;

import java.util.HashSet;

public class Question1
{
	public static void main(String[] args) 
	{
		HashSet s1 = new HashSet();
		s1.add(10);
		s1.add(50);
		s1.add(80);
		s1.add(120);
		s1.add(25);
		
		System.out.println(s1);
		
		s1.add(99);
		
		System.out.println(s1);
	}
}
