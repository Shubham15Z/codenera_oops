/*
12. Write a Java program to extract a portion of an array list.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyArrayList12
{
	public void portionOfList()
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(100);
		l1.add(70);
		l1.add(55);
		l1.add(80);
		l1.add(35);
		System.out.println("List of Integer is : "+l1);
		
		List<Integer> l2 = l1.subList(3, 6);
		System.out.println("List of Portion : "+l2);

	}
		
}
public class Question12
{
	public static void main(String[] args) 
	{
		MyArrayList12 ob1 = new MyArrayList12();
		ob1.portionOfList();
	}
}
