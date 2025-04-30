/*
1.Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList1
{
	public void printColor()
	{
		ArrayList color = new ArrayList();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		System.out.println("List of colors is : "+color);
	}
}
public class Question1 
{
	public static void main(String[] args) 
	{
		MyArrayList1 ob1 = new MyArrayList1();
		ob1.printColor();
	}
}
