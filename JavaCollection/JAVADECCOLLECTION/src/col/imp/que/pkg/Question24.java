/*
24. Find Common Elements  
    - Question: Find common elements between two HashSet objects.
    - Input: {1, 2, 3}, {2, 3, 4}
    - Output: {2, 3}
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question24
{
	public static void main(String[] args)
	{
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(2,3,4));
		
		Set<Integer> common = new HashSet<Integer>(set1);
		
		common.retainAll(set2);
		
		System.out.println(common);
	}
}
