/*
Question 4: Find the maximum and minimum values in a list of integers.
Write a method that takes a list of integers as input and returns a pair of the maximum and minimum values in the list. 
Use the Stream API to solve this problem.
 */

package listmap.practice1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 
{
	public static List<Integer> findMaxMin(List<Integer> list1)
	{
		int max = list1.stream().max((a,b) -> a-b).orElse(100);
		int min = list1.stream().min((a,b) -> a-b).orElse(0);

		return Arrays.asList(max,min);
	}
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2,5,8,1,3,9,4));
		List<Integer> res = findMaxMin(list1);
		System.out.println("The Max and Min pair is : "+res);
	}
}
