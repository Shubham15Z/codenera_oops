/*
2. Square of Numbers  
   - Question: Given a list of integers, use the Stream API to return a list of their squares.
   - Input: [1, 2, 3, 4]
   - Output: [1, 4, 9, 16]
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		
		List<Integer> square1 = list1.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println("Square : "+square1);
	}
	
	
}
