/*
Q4. Implement a program to find the maximum element from a list using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,40,30,90,50));
		
//		int max = list1.stream().max((a,b) -> a-b).orElse(Integer.MAX_VALUE);
//		int max = list1.stream().mapToInt(i->i).max().orElse(Integer.MAX_VALUE);
		int max = list1.stream().sorted((a,b) -> b-a).findFirst().orElse(Integer.MAX_VALUE);
		
		System.out.println("Maximum element : "+max);
	}
}
