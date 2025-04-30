/*
10. Write a Java program to shuffle elements in an array list.
 */

package arraylist.practice1.pkg;

import java.util.ArrayList;
import java.util.Collections;

class MyArrayList10
{
	public void shuffleListElements()
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(100);
		l1.add(70);
		l1.add(55);
		System.out.println("List of Integer is : "+l1);
		
		Collections.shuffle(l1);

		System.out.println("List after shuffling elements : "+l1);
	}
		
}
public class Question10
{
	public static void main(String[] args) 
	{
		MyArrayList10 ob1 = new MyArrayList10();
		ob1.shuffleListElements();
	}
}
