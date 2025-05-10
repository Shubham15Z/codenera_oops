/*
Q4. Implement a program to find the maximum element from a list using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		int max = list1.stream().max((n1,n2) -> n1-n2).orElseThrow();
		System.out.println("Max : "+max);
	}
}
