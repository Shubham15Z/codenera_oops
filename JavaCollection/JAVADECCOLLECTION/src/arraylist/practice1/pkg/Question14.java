/*
14. Write a Java program that swaps two elements in an array list.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;
import java.util.Collections;

class MyArrayList14
{
	public void swapTwoListElements()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		color.add("Black");
		color.add("Purple");
		color.add("Pink");
		
		System.out.println("List 1 : \n"+color);
		
		Collections.swap(color, 2, 5);
		
		System.out.println("List 1 after swaping: \n"+color);
	}
}
public class Question14
{
	public static void main(String[] args) 
	{
		MyArrayList14 ob1 = new MyArrayList14();
		ob1.swapTwoListElements();
	}
}
