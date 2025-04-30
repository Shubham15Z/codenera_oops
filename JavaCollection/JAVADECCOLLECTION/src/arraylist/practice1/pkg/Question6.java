/*
6. Write a Java program to remove the third element from an array list.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList6
{
	public void removeColor()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		color.add("Black");
		color.add("Purple");
		
		System.out.println("List of colors is : "+color);
		
		color.remove(3);
		
		System.out.println("Color after removing at index 3 : "+color);
	}
}
public class Question6
{
	public static void main(String[] args) 
	{
		MyArrayList6 ob1 = new MyArrayList6();
		ob1.removeColor();
	}
}
