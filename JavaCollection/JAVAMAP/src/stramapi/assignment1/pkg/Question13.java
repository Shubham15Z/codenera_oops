/*
Q13. Write a program to remove null values from a list using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question13
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,null,3,45,null,15,20));
		
		List<Integer> l1 = list1.stream().filter(i -> i != null).collect(Collectors.toList());
		
		System.out.println(list1);
		System.out.println(l1);
	}
}
