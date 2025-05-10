/*
2. Find the Maximum Element in an ArrayList
   - Task: Write a program to find and print the maximum element in an ArrayList<Integer>.
   java
   ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 7, 2, 8));
 */

package arraylist.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question2 
{
	public static int findMax(ArrayList<Integer> l1)
	{
		int max = 0;
		for(Integer num : l1)
		{
			if(num > max)
			{
				max = num;
			}
		}
		return max;
//		return Collections.max(l1);
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 7, 2, 8));
		int max = findMax(list);
		System.out.println("Maximum element is : "+max);
	}
}
