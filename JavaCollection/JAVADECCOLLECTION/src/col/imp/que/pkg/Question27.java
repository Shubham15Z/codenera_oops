/*
27. Remove Every N-th Element  
    - Question: Remove every n-th element from a LinkedList.
    - Input: [1, 2, 3, 4, 5, 6], n = 2
    - Output: [1, 3, 5]
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Question27 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6));
		int n = 2;
		
		ListIterator<Integer> itr = list1.listIterator();
		int count = 1;
		
		while(itr.hasNext())
		{
			itr.next();
			if(count % n == 0)
			{
				itr.remove();
			}
			count++;
		}
		
		System.out.println(list1);
	}
}
