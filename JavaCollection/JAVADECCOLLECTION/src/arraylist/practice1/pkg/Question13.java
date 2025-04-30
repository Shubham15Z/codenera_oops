/*
13. Write a Java program to compare two array lists.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList13
{
	public void compareList()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		System.out.println("List 1 : "+color);
		
		ArrayList<String> color1 = new ArrayList<String>();

		color1.add("Black");
		color1.add("Purple");
		color1.add("Pink");
		
		System.out.println("List 2 : "+color1);
		
		System.out.println("After comparing two list : "+color.containsAll(color1));
	}
}
public class Question13
{
	public static void main(String[] args) 
	{
		MyArrayList13 ob1 = new MyArrayList13();
		ob1.compareList();
	}
}
