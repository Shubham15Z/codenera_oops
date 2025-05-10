/*
Q17. Write a program to group elements of a list by their lengths using streams.
 */
package stramapi.assignment1.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question17 
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("apple", "bat", "ball", "cat", "elephant","kill");
		
		Map<Integer, List<String>> groupByLength = list.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(groupByLength);

	}
}
