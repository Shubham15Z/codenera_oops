/*
11. Write a Java program to reverse elements in an array list.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyArrayList11
{
	public void reverseListElement()
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(100);
		l1.add(70);
		l1.add(55);
		System.out.println("List of Integer is : "+l1);
		
		Collections.reverse(l1);
		System.out.println("List after reversing elements : "+l1);
		
		List<Integer> l2 = l1.reversed();
		System.out.println("List after reversing elements : "+l2);
	}
		
}
public class Question11
{
	public static void main(String[] args) 
	{
		MyArrayList11 ob1 = new MyArrayList11();
		ob1.reverseListElement();
	}
}
