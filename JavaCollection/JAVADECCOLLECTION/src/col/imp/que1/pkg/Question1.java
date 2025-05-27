/*
1. Filter Even Numbers  
   - Question: Given a list of integers, use a lambda expression to filter and collect only even numbers.
   - Input: [1, 2, 3, 4, 5, 6]
   - Output: [2, 4, 6]
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		List<Integer> even = list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		System.out.println(even);
	}
}
