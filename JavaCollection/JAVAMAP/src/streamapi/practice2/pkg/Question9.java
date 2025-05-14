/*
Q9. Write a program to find the square of each element in a list using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,40,30,90,50));
		
		List<Double> list2 = list1.stream().map(i -> Math.pow(i, 2)).collect(Collectors.toList());
//		List<Integer> list2 = list1.stream().map(i -> i*i).collect(Collectors.toList());
		
		System.out.println(list2);
	}
}
