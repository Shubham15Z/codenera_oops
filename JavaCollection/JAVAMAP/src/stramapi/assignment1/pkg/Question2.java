/*
Q2.Implement a program to filter even numbers from a list using the Stream API.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		List<Integer> even = list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers : "+even);
	}
}
