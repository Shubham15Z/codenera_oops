package arraylist.practice1.pkg;

import java.util.ArrayList;

class MyArrayList4
{
	public void printColor()
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		
		System.out.println("List of colors is : "+color);
		
		System.out.println("Color at index 2: "+color.get(2));
	}
}
public class Question4 
{
	public static void main(String[] args) 
	{
		MyArrayList4 ob1 = new MyArrayList4();
		ob1.printColor();
	}
}
