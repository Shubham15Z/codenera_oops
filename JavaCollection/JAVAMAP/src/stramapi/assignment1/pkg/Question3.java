/*
Q3. Write a program to find the sum of all elements in a list using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		int sum = list1.stream().reduce(0,(n1,n2) -> n1+n2);
		System.out.println("Sum : "+sum);
	}
}
