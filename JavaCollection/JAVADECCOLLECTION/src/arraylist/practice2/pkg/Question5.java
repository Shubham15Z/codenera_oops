/*
5. Reverse an ArrayList
   - Task: Given an ArrayList<String>, write a program to reverse the order of elements.
   java
   ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
 */

package arraylist.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question5 
{
	public static ArrayList<String> reverseList(ArrayList<String> l1)
	{
		int left = 0;
		int right = l1.size()-1;
		
		while(left < right)
		{
			String temp = l1.get(left);
			l1.set(left, l1.get(right));
			l1.set(right, temp);
			
			left++;
			right--;
		}
		
		return l1;
		
//		Collections.reverse(l1);
//		return l1;
	}
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		ArrayList<String> result = reverseList(list);
		System.out.println(result);
	}
}
