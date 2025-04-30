/*
10. Write a Java program to compare two hash set.
 */

package hashset.pkg;

import java.util.Arrays;
import java.util.HashSet;

public class Question10 
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
		s2.add(50);
		s2.add(80);
		s2.add(120);
		s2.add(25);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.containsAll(s2));
	}
}
