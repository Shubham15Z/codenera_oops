/*
10. Create a New ArrayList by Squaring Elements of Another
    - Task: Given an ArrayList<Integer>, write a program to create and print a new ArrayList containing the squares of the original elements.
    java
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
 */

package arraylist.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class Question10 
{
	public static ArrayList<Integer> findSquare(ArrayList<Integer> l1)
	{
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for(Integer num : l1)
		{
			l2.add((int) Math.round(Math.pow(num, 2)));
		}
		return l2;
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> list2 = findSquare(list);
		System.out.println("Square of each element is : "+list2);
	}
}
