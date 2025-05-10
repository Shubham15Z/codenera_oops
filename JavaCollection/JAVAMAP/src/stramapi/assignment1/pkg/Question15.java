/*
Q15. Write a program to find the second smallest element in a list using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question15 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<>(Arrays.asList(12,4,8,23,90));
		
		Optional<Integer> secondSmallest = list1.stream().sorted().distinct().skip(1).findFirst();
		
		System.out.println("Second Smallest : "+secondSmallest.get());
	}
}
