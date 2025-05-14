/*
Q12. Implement a program to find the distinct elements in a list using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question12 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(100,400,10,40,30,10,90,40,50,30,40));
		
		List<Integer> list2 = list1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list2);
	}
}
