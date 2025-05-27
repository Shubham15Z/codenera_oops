/*
14. Collect to Set  
    - Question: Convert a list of integers to a set.
    - Input: [1, 2, 2, 3, 4, 4, 5]
    - Output: {1, 2, 3, 4, 5}
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question14 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5));
		
		Set<Integer> set1 = list1.stream().collect(Collectors.toSet());
		
		System.out.println(set1);
	}
}
