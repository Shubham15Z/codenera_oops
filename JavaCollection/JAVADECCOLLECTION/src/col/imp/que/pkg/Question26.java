/*
26. Reverse LinkedList  
    - Question: Reverse a LinkedList.
    - Input: [1, 2, 3, 4]
    - Output: [4, 3, 2, 1]
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Question26
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,3,4));
		
		List<Integer> l2 = list1.reversed();
		
		System.out.println(l2);
	}
}
