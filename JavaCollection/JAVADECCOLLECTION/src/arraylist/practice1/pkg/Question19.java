/*
19. Write a Java program for trimming the capacity of an array list.
 */


package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList19
{
	public void trimCapacity()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		color.trimToSize();
		
		System.out.println("List 1 size : "+color.size());
	}
}
public class Question19
{
	public static void main(String[] args) 
	{
		MyArrayList19 ob1 = new MyArrayList19();
		ob1.trimCapacity();
	}
}
