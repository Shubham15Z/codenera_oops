/*
Q12. Implement a program to find the distinct elements in a list using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question12
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,20,3,45,15,62,20,3,45,20,10));
		
		List<Integer> l1 = list1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(l1);
	}
}
