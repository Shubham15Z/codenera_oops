/*
19. Merge Two TreeSets  
    - Question: Merge two TreeSets without duplicates.
    - Input: [1, 2, 3], [2, 3, 4]
    - Output: [1, 2, 3, 4]
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.TreeSet;

public class Question19 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> set1 = new TreeSet<Integer>(Arrays.asList(1,2,3));
		TreeSet<Integer> set2 = new TreeSet<Integer>(Arrays.asList(2,3,4));
		
		set1.addAll(set2);
		
		System.out.println(set1);
	}
}
