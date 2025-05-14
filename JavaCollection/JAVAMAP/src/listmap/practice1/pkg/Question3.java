/*
Question 3: Find the average of a list of doubles.
Write a method that takes a list of doubles as input and returns the average of the numbers in the list. 
Use the Stream API to solve this problem.
 */

package listmap.practice1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question3
{
	public static double findAverage(List<Double> list1)
	{
		return list1.stream().mapToDouble(i -> i).average().orElse(0.0);
		
	}
	public static void main(String[] args) 
	{
		List<Double> list1 = new ArrayList<Double>(Arrays.asList(10.0,12.5,30.4,50.2));
		
		double res = findAverage(list1);
		
		System.out.println("Average of list of doubles is : "+res);
	}
}
