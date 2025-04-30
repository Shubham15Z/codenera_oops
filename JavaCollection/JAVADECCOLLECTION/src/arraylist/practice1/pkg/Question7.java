/*
7. Write a Java program to search for an element in an array list.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList7
{
	public void searchColor()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		color.add("Black");
		color.add("Purple");
		
		System.out.println("List of colors is : "+color);
		
		String c1 = "Yellow";
		
		System.out.println("To search Yellow color index: "+color.indexOf(c1));
		System.out.println("To search Yellow color : "+color.contains(c1));
	}
}
public class Question7
{
	public static void main(String[] args) 
	{
		MyArrayList7 ob1 = new MyArrayList7();
		ob1.searchColor();
	}
}
