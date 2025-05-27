/*
23. Symmetric Difference  
    - Question: Find elements that are only in one of the two sets (symmetric difference).
    - Input: {1, 2, 3}, {2, 3, 4}
    - Output: {1, 4}
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question23 
{
	public static void main(String[] args) 
	{
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(2,3,4));
		
		Set<Integer> common = new HashSet<Integer>(set1);
		Set<Integer> result = new HashSet<Integer>(set1);
		
		common.retainAll(set2);
		
		result.addAll(set2);
		
		result.removeAll(common);
		
		System.out.println(result);
	}
}
