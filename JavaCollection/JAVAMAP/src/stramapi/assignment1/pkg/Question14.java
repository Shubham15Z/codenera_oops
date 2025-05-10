/*
Q14. Implement a program to concatenate two lists using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question14 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(5,6,7,8));
		
		List<Integer> combined = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(combined);
	}
}
 