/*
2. Custom Comparator:
Create a custom Comparator to sort a list of Strings based on their lengths in ascending order.
 */

package comparator.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyString
{
	private String fruits;

	public MyString(String fruits) {
		super();
		this.fruits = fruits;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		return fruits;
	}
}

class SortFruits implements Comparator<MyString>
{
	@Override
	public int compare(MyString o1, MyString o2) {
		if(o1.getFruits().length() > o2.getFruits().length())
			return 1;
		else if(o1.getFruits().length() < o2.getFruits().length())
			return -1;
		else
			return 0;
	}
	
}
public class Question2
{
	public static void main(String[] args) 
	{
		ArrayList<MyString> fruits = new ArrayList<MyString>();
		fruits.add(new MyString("Grapes"));
		fruits.add(new MyString("Watermelon"));
		fruits.add(new MyString("Guava"));
		fruits.add(new MyString("Apple"));
		fruits.add(new MyString("Kiwi"));
		fruits.add(new MyString("Strawberry"));
		
		System.out.println(fruits);
		
		System.out.println("\nSorting of list of strings based on length...");
		Collections.sort(fruits, new SortFruits());
		System.out.println(fruits);
		
	}
}
