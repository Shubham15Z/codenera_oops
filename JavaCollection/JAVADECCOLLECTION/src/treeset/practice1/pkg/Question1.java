/*
1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
 */

package treeset.practice1.pkg;

import java.util.TreeSet;

public class Question1 
{
	public static void main(String[] args) 
	{
		TreeSet color = new TreeSet();
		color.add("Yellow");
		color.add("Pink");
		color.add("Red");
		
		System.out.println(color);
	}
}
