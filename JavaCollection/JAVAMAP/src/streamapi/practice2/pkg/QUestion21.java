/*
Q21. Write a program to remove duplicate elements from a list using streams.
 */


package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QUestion21 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,3,5,8,2,3,6));
		
		List<Integer> l2 = l1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(l1);
		System.out.println(l2);
	}
}
