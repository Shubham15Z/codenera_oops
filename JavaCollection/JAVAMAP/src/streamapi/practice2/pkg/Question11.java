/*
Q11. Write a program to find the first occurrence of a given element in a list using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Question11 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(100,400,10,40,30,10,90,40,50,30,40));
		int k = 40;
		
		int index = IntStream.range(0, list1.size()).filter(i -> list1.get(i) == k).findFirst().orElse(-1);
		
		System.out.println("Index is : "+index);
	}
}
