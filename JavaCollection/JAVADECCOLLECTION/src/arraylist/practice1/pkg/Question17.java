/*
17. Write a Java program to empty an array list.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList17
{
	public void emptyArrayList()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		color.removeAll(color);
		
		System.out.println("List 1 after removing all elements:\n"+color);
	}
}
public class Question17
{
	public static void main(String[] args) 
	{
		MyArrayList17 ob1 = new MyArrayList17();
		ob1.emptyArrayList();
	}
}
