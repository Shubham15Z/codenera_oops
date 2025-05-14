/*
Q22. Implement a program to find the intersection of two lists using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question22 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(3,4,5,6,7));
		
		List<Integer> intersection = l1.stream().filter(i -> l2.contains(i)).collect(Collectors.toList());
		
		System.out.println(intersection);
		
	}
}
