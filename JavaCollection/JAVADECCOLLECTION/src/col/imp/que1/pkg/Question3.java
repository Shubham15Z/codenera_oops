/*
3. Filter and Sort  
   - Question: Given a list of integers, filter out even numbers and then sort the list in descending order.
   - Input: [5, 2, 8, 1, 4]
   - Output: [8, 4, 2]
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(5,2,8,1,4));
		
		List<Integer> even = list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		even.sort((a,b) -> b-a);
		
		System.out.println(even);
	}
}
