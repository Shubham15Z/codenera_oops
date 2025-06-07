/*
Use a lambda expression to find the maximum value in a list of numbers.
 */

package com.lambda.practice1.pkg;

import java.util.Arrays;
import java.util.List;

interface MaxValue
{
	int findMax(List<Integer> l1);
}
public class Question3 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = Arrays.asList(12,45,2,8,97,23,6);
		
		MaxValue max = (List<Integer> l1) -> {
			return l1.stream()
			.max((n1,n2) -> n1.compareTo(n2)).orElse(0);
		};
		
		int res = max.findMax(list1);
		System.out.println(res);
	}
}
