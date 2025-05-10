/*
Q5. Write a program to count the number of elements in a list using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		long count = list1.stream().count();
		System.out.println("Count : "+count);
	}
}
