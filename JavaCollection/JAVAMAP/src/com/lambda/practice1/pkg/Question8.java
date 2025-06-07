/*
Use a lambda function to find the average of a list of numbers.
 */

package com.lambda.practice1.pkg;

import java.util.Arrays;
import java.util.List;

interface AverageList
{
	double findAverage(List<Integer> l1);
}

public class Question8 
{
	public static void main(String[] args)
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		
		AverageList calAvg = (list1) -> {
			return list1
					.stream()
					.mapToInt(n1 -> n1)
					.average().orElse(0.0);
		};
		
		double res = calAvg.findAverage(l1);
		
		System.out.println(res);
	}
}
