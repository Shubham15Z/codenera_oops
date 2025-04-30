package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList2
{
	public void printColor()
	{
		ArrayList color = new ArrayList();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		System.out.println("List of colors is : ");
		
		for(int i = 0; i < color.size(); i++)
		{
			System.out.println(color.get(i));
		}
	}
}
public class Question2 
{
	public static void main(String[] args) 
	{
		MyArrayList2 ob1 = new MyArrayList2();
		ob1.printColor();
	}
}