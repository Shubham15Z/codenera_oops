/*
Q18. Implement a program to find the most frequently occurring element in a list using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question18 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,3,2,3,4,2,3,1,3));
		
		Map<Integer,Long> frequency = l1.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		
		System.out.println(frequency);
		
		Optional<Map.Entry<Integer, Long>> mostFrequent = frequency.entrySet().stream().max(Map.Entry.comparingByValue());
		
		System.out.println(mostFrequent.get().getKey());
		
		
	}
}
