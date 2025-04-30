/*
16. Write a Java program to clone an array list to another array list.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList16
{
	public void cloneOneListToOther()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		ArrayList<String> color1 = new ArrayList<String>();
		
		
		color1.addAll(color);
	
		System.out.println("List 2 after cloning all List 1 elements:\n"+color1);
	}
}
public class Question16
{
	public static void main(String[] args) 
	{
		MyArrayList16 ob1 = new MyArrayList16();
		ob1.cloneOneListToOther();
	}
}
