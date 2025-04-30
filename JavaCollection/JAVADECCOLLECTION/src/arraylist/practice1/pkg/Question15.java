/*
15. Write a Java program to join two array lists.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;
import java.util.Collections;

class MyArrayList15
{
	public void joinTwoList()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		ArrayList<String> color1 = new ArrayList<String>();
		color1.add("Black");
		color1.add("Purple");
		color1.add("Pink");
		
		color.addAll(color1);
	
		System.out.println("List 1 after adding List 2: \n"+color);
	}
}
public class Question15
{
	public static void main(String[] args) 
	{
		MyArrayList15 ob1 = new MyArrayList15();
		ob1.joinTwoList();
	}
}
