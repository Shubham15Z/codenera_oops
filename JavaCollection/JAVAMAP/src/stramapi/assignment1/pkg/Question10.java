/*
Q10. Implement a program to check if all elements in a list are greater than a certain value using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question10 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,20,3,45,15,62));
		int k = 10;
		
		boolean allGreater = list1.stream().allMatch(i -> i > k);
		
		System.out.println(allGreater);
	}
}
