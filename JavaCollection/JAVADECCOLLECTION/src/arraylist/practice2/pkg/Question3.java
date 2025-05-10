/*
3. Count the Occurrences of Each Element
   - Task: Given an ArrayList<String>, write a program to count and print the occurrences of each element.
   java
   ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
 */

package arraylist.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class Question3 
{
	public static void countOcuurence(ArrayList<String> l1)
	{
		for(int i = 0; i < l1.size(); i++)
		{
			int count = 1;
			for(int j = i+1; j < l1.size(); j++)
			{
				if(l1.get(i) == l1.get(j))
				{
					count++;
					l1.set(j, "-1");
				}
			}
			if(l1.get(i) != "-1")
			{
				System.out.println(l1.get(i)+" : "+count);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
		countOcuurence(list);
	}
}
