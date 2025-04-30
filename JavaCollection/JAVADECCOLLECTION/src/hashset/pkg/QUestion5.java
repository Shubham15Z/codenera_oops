/*
5. Write a Java program to test if a hash set is empty or not.
 */

package hashset.pkg;

import java.util.HashSet;

public class QUestion5 
{
	public static void main(String[] args) 
	{
		HashSet s1 = new HashSet();
		s1.add(10);
		s1.add(50);
		s1.add(80);
		s1.add(120);
		s1.add(25);
		
		System.out.println(s1.isEmpty());
		s1.clear();
		System.out.println(s1.isEmpty());
	}
}
