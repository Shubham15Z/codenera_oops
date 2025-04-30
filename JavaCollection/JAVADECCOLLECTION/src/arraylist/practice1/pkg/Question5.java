/*
5. Write a Java program to update an array element by the given element.
 */
package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList5
{
	public void updateColor()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		System.out.println("List of colors is : "+color);
		
		
		color.set(1, "Black");
		
		System.out.println("Color after updating at index 1 : "+color);
	}
}
public class Question5
{
	public static void main(String[] args) 
	{
		MyArrayList5 ob1 = new MyArrayList5();
		ob1.updateColor();
	}
}
