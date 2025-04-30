/*
3. Write a Java program to insert an element into the array list at the first position.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList3
{
	public void printColor()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		System.out.println("List of colors is : "+color);
		
		color.add(0, "Pink");
		
		System.out.println("Color inserting at index 0 : "+color);
	}
}
public class Question3
{
	public static void main(String[] args) 
	{
		MyArrayList3 ob1 = new MyArrayList3();
		ob1.printColor();
	}
}
