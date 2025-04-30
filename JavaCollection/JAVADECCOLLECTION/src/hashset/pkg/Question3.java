/*
3. Write a Java program to get the number of elements in a hash set.
 */

package hashset.pkg;

import java.util.HashSet;
import java.util.Iterator;

public class Question3
{
	public static void main(String[] args) 
	{
		HashSet s1 = new HashSet();
		s1.add(10);
		s1.add(50);
		s1.add(80);
		s1.add(120);
		s1.add(25);
		
		System.out.println(s1.size());
	}
}
