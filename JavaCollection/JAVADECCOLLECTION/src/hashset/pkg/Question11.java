/*
11. Write a Java program to compare two sets and retain elements that are the same.
 */

package hashset.pkg;

import java.util.HashSet;

public class Question11
{
	public static void main(String[] args)
	{
		HashSet s1 = new HashSet();
		s1.add(10);
		s1.add(50);
		s1.add(80);
		s1.add(120);
		s1.add(25);
		
		HashSet s2 = new HashSet();
		s2.add(10);
		s2.add(40);
		s2.add(20);
		s2.add(100);
		s2.add(25);
		
		s1.retainAll(s2);
		System.out.println(s1);
	}
}
