/*
12. Write a Java program to remove all elements from a hash set.
 */

package hashset.pkg;

import java.util.Arrays;
import java.util.HashSet;

public class Question12 
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
		s1.removeAll(s1);
		System.out.println(s1);
	}
}
