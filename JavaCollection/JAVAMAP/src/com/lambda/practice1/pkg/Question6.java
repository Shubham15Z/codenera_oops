/*
Create a lambda function to filter out all the negative numbers from a list.
 */

package com.lambda.practice1.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface FilterNumber
{
	List<Integer> findNegative(List<Integer> l1);
}

public class Question6 
{
	public static void main(String[] args)
	{
		List<Integer> l1 = Arrays.asList(12,4,-2,5,-23,0,-100,50);
		
		FilterNumber neg = (list1) -> {
			return list1
					.stream()
					.filter(n1 -> (n1 < 0))
					.collect(Collectors.toList());
		};
		
		List<Integer> res = neg.findNegative(l1);
		
		System.out.println(res);
	}
}
