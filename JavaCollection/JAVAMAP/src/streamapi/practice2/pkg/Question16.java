/*
Q16. Implement a program to partition a list into even and odd numbers using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question16
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		Map<Boolean, List<Integer>> partitioned = list1.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		
		System.out.println(partitioned);
		
		System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));
	}
}
