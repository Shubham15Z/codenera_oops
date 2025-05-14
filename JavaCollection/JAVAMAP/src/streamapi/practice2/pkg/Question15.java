/*
Q15. Write a program to find the second smallest element in a list using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question15
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,40,30,90,50));
		
		int secondSmall = list1.stream().sorted().skip(1).findFirst().orElse(null);
		
		System.out.println("Second smallest element is : "+secondSmall);
	}
}
