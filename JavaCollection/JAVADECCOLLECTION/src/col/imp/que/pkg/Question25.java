/*
25. Remove Elements by Condition  
    - Question: Remove all elements from a HashSet greater than a given threshold.
    - Input: {1, 2, 3, 4, 5}, threshold = 3
    - Output: {1, 2, 3}
 */
package col.imp.que.pkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question25 
{
	public static void main(String[] args)
	{
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		int t = 3;
	
		set1.removeIf(i -> i > t);
		
		System.out.println(set1);
	}
}
