/*
Q3. Write a program to find the sum of all elements in a list using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,40,30,90,50));
		
//		int sum = list1.stream().reduce((a,b) -> a+b).orElse(0);
		int sum = list1.stream().mapToInt(i->i).sum();
		
		System.out.println("Sum : "+sum);
	}
}
