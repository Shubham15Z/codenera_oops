/*
9. Write a Java program to copy one array list into another.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;
import java.util.Collections;

class MyArrayList9
{
	public void copyList()
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(100);
		l1.add(70);
		l1.add(55);
		System.out.println("List of Integer is : "+l1);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		l2.addAll(l1);
		
		System.out.println("List after copying all elements : "+l2);
	}
		
}
public class Question9
{
	public static void main(String[] args) 
	{
		MyArrayList9 ob1 = new MyArrayList9();
		ob1.copyList();
	}
}
