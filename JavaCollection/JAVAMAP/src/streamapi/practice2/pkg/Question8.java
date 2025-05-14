/*
Q8. Implement a program to find the average of all numbers in a list using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,40,30,90,50));
		
//		double average = list1.stream().mapToInt(i->i).average().orElse(0.0);
		double average = list1.stream().collect(Collectors.averagingDouble(i->i));
		
		System.out.println("Average : "+average);
	}
}
