/*
20. Write a Java program to increase an array list size.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList20
{
	public void increaseSize()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
	
		System.out.println("List 1 before increasing capacity :"+color);
		
		color.ensureCapacity(20);
		
		color.add("White");
		color.add("Purple");
		
		System.out.println("List 1 after increasing capacity :"+color);
	}
}
public class Question20
{
	public static void main(String[] args) 
	{
		MyArrayList20 ob1 = new MyArrayList20();
		ob1.increaseSize();
	}
}
