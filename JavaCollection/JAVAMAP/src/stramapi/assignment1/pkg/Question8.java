/*
Q8. Implement a program to find the average of all numbers in a list using streams.
 */
package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question8 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		double average = list1.stream().mapToDouble(i -> i).average().orElseThrow();
		System.out.println("Average : "+average);
	}
}
