/*
4. Count Elements Greater than X  
   - Question: Count how many elements in a list of integers are greater than a given number x.
   - Input: [1, 5, 7, 10, 12], x = 5
   - Output: 3
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Question4
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 5, 7, 10, 12));
		int x = 5;
		Long count = list1.stream().filter(i -> i > x).count();
		System.out.println("Count : "+count);
		
	}
}
