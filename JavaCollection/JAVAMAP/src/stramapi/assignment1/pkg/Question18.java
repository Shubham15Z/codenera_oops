/*
Q18. Implement a program to find the most frequently occurring element in a list using streams.
 */

package stramapi.assignment1.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question18 
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
		
		Integer mostFrequent = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		
		System.out.println("Most Frequent Element : "+mostFrequent);
	}
}
