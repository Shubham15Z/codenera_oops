/*
 Q14. Implement a program to concatenate two lists using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question14 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
		
		List<Integer> combined = Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
		
		System.out.println(combined);
	}
}
