/*

28. Rotate LinkedList by K Positions  
    - Question: Rotate a LinkedList by k positions to the right.
    - Input: [1, 2, 3, 4, 5], k = 2
    - Output: [4, 5, 1, 2, 3]
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Question28 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		int k = 2;
		
		
		for(int j = 1; j <= k; j++)
		{
			int temp = list1.getLast();
			
			for(int i = list1.size()-1; i >= 1; i--)
			{
				list1.set(i, list1.get(i-1));
			}
			
			list1.set(0, temp);
		}
		
		
		System.out.println(list1);
	}
}
