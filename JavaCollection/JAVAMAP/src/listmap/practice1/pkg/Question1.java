/*
Question 1: Find the sum of all even numbers in a list.
Write a method that takes a list of integers as input and returns the sum of all even numbers in the list. 
Use the Stream API to solve this problem.
 */

package listmap.practice1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1
{
	public static int findSum(List<Integer> list1)
	{
		int sumEven = list1.stream().filter(i -> i%2 == 0).reduce((a,b) -> a+b).orElseThrow();
		return sumEven;
	}
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2,5,8,3,9,4));
		
		int res = findSum(list1);
		
		System.out.println("The sum of even numbers in list is : "+res);
	}
}
