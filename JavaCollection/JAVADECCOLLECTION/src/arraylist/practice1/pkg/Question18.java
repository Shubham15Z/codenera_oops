/*
18. Write a Java program to test whether an array list is empty or not.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList18
{
	public void checkArrayList()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		System.out.println("Check ArrayList empty or not : "+color.isEmpty());
		
		color.removeAll(color);
		
		System.out.println("List 1 after removing all elements: "+color.isEmpty());
	}
}
public class Question18
{
	public static void main(String[] args) 
	{
		MyArrayList18 ob1 = new MyArrayList18();
		ob1.checkArrayList();
	}
}
