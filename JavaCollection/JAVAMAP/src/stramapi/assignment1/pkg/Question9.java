/*
Q9. Write a program to find the square of each element in a list using streams.

 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		List<Integer>square1 = list1.stream().map(n1 -> n1*n1).collect(Collectors.toList());
		
		System.out.println(list1);
		System.out.println(square1);
	}
}
