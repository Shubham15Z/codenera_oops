/*
Q2.Implement a program to filter even numbers from a list using the Stream API.
 */


package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,3,45,30,91,86,50));
		
		List<Integer> list2 = list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		System.out.println(list1);
		System.out.println("Even : "+list2);
	}
}
