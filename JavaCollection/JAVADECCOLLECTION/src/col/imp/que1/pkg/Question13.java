/*
13. Skip and Limit  
    - Question: Skip the first two elements and then take the next three elements in a list.
    - Input: [1, 2, 3, 4, 5, 6, 7]
    - Output: [3, 4, 5]
 */


package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question13 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		
		List<Integer> list2 = list1.stream().skip(2).limit(3).collect(Collectors.toList());
		
		System.out.println(list2);
	}
}
