/*
Q11. Write a program to find the first occurrence of a given element in a list using streams.
 */

package stramapi.assignment1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Question11
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,20,3,45,15,62,20,3,45,20,10));
		int k = 45;
		
		OptionalInt firstIndex = IntStream.range(0,list1.size()).filter(i -> list1.get(i) == k).findFirst();
		System.out.println(firstIndex.getAsInt());
	}
}
