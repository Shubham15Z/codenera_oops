/*
6. Write a Java program to clone a hash set to another hash set.
 */

package hashset.pkg;

import java.util.HashSet;

public class Question6 
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
		HashSet s2 = (HashSet)s1.clone();
		System.out.println(s2);
	}
}
