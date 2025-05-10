/*
Q16. Implement a program to partition a list into even and odd numbers using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question16 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		List<Integer> even = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		List<Integer> odd = list1.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
	}
}
