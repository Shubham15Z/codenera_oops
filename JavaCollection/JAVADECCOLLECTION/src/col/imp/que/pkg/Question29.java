/*
29. Find Middle Element  
    - Question: Find the middle element in a LinkedList.
    - Input: [1, 2, 3, 4, 5]
    - Output: 3
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Question29 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		
		System.out.println(list1.get(list1.size()/2));
	}
}
