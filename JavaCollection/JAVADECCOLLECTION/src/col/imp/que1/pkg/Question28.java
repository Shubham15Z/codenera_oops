/*
28. Check for Duplicates  
    - Question: Check if a list of integers contains duplicates.
    - Input: [1, 2, 3, 4, 5, 2]
    - Output: true
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question28 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,2));
		
		boolean res = list1.stream().collect(Collectors.toSet()).size() < list1.size();
		
		System.out.println(res);
	}
}
