/*
7. Write a Java program to convert a hash set to an array.
 */

package hashset.pkg;

import java.util.Arrays;
import java.util.HashSet;

public class Question7 
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
		Object[] s2 = s1.toArray();
		System.out.println(Arrays.toString(s2));
	}
}
