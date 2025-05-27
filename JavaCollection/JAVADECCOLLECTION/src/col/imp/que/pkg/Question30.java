/*
30. Remove Duplicates from LinkedList  
    - Question: Remove duplicates from an unsorted LinkedList.
    - Input: [1, 2, 2, 3, 4, 4, 5]
    - Output: [1, 2, 3, 4, 5]
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Question30 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,2,3,4,4,5));
		
		List<Integer> unique = new LinkedList<Integer>();
		
		for(int num : list1)
		{
			if(!unique.contains(num))
			{
				unique.add(num);
			}
		}
		
		System.out.println(unique);
	}
}
