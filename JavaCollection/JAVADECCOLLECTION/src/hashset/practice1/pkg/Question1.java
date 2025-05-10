/*
21. Union of Two Sets  
    - Question: Find the union of two HashSet objects.
    - Input: {1, 2, 3}, {3, 4, 5}
    - Output: {1, 2, 3, 4, 5}
 */

package hashset.practice1.pkg;

import java.util.Arrays;
import java.util.HashSet;

public class Question1 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1 = new HashSet<Integer>(Arrays.asList(1,2,3));
		HashSet<Integer> h2 = new HashSet<Integer>(Arrays.asList(3,4,5));
		
		HashSet<Integer> union = new HashSet<Integer>();
		union.addAll(h1);
		union.addAll(h2);
		
		System.out.println(union);
	}
}
