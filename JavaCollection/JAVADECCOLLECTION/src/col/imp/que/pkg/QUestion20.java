/*
20. Find Unique Elements  
    - Question: Add elements from a list to a TreeSet and retrieve unique elements in sorted order.
    - Input: [5, 1, 3, 5, 1]
    - Output: [1, 3, 5]
 */

package col.imp.que.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class QUestion20 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(5,1,3,5,1));
		
		TreeSet<Integer> unique = new TreeSet<Integer>(l1);
		
		System.out.println(unique);
	}
}
