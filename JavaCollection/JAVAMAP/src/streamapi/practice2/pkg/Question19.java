/*
Q19. Write a program to convert a list of integers to a comma-separated string using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question19 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		String numbers = l1.stream().map(i->i+"").collect(Collectors.joining(","));
		
		System.out.println(numbers);
		System.out.println(numbers.length());
	}
}
