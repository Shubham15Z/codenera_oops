/*
21. Union of Two Sets  
    - Question: Find the union of two HashSet objects.
    - Input: {1, 2, 3}, {3, 4, 5}
    - Output: {1, 2, 3, 4, 5}
 */
package col.imp.que.pkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question21 
{
	public static void main(String[] args)
	{
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3,4,5));
		
		Set<Integer> union = new HashSet<Integer>();
		union.addAll(set1);
		union.addAll(set2);
		
		System.out.println(union);
	}
}
