/*
3. Filter and Sort  
   - Question: Given a list of integers, filter out even numbers and then sort the list in descending order.
   - Input: [5, 2, 8, 1, 4]
   - Output: [8, 4, 2]
 */

package stream.api.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(5, 2, 8, 1, 4));
		
		List<Integer> even1 = list1.stream().filter(i -> i%2 == 0).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		
//		even1.sort(Collections.reverseOrder());
		System.out.println(even1);
	}
}
