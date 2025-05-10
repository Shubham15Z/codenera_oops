/*
19. Merge Two TreeSets  
    - Question: Merge two TreeSets without duplicates.
    - Input: [1, 2, 3], [2, 3, 4]
    - Output: [1, 2, 3, 4]
 */

package treeset.practice2.pkg;

import java.util.Arrays;
import java.util.TreeSet;

public class Question4
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t1 = new TreeSet<Integer>(Arrays.asList(1,2,3));
		System.out.println(t1);
		
		TreeSet<Integer> t2 = new TreeSet<Integer>(Arrays.asList(2,3,4));
		System.out.println(t1);
		
		t1.addAll(t2);
		System.out.println(t1);
		
	}
	
}
