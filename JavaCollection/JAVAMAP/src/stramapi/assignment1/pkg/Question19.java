/*
Q19. Write a program to convert a list of integers to a comma-separated string using streams.
 */

package stramapi.assignment1.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question19 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		
		String result = list.stream().map(String::valueOf).collect(Collectors.joining(","));
		
		System.out.println(result);
	}
}
