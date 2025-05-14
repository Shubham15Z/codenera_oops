/*
Q13. Write a program to remove null values from a list using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question13 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,null,40,30,null,90,50));
		
//		List<Integer> list2 = list1.stream().filter(i -> i != null).collect(Collectors.toList());
		
		List<Integer> list2 = list1.stream().flatMap(i->i == null ? Stream.empty() : Stream.of(i)).collect(Collectors.toList());
		System.out.println(list2);
	}
}
