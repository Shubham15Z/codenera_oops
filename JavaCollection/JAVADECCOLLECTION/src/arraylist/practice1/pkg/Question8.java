/*
8. Write a Java program to sort a given array list.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class MyArrayList8
{
	public void sortList()
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(100);
		l1.add(70);
		l1.add(55);
		
		System.out.println("List of Integer is : "+l1);
		
		Collections.sort(l1);
		
		System.out.println("List of Integer after sorting : "+l1);
	}
		
}
public class Question8
{
	public static void main(String[] args) 
	{
		MyArrayList8 ob1 = new MyArrayList8();
		ob1.sortList();
	}
}
