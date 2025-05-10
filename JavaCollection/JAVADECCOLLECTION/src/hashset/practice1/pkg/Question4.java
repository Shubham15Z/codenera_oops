/*
24. Find Common Elements  
    - Question: Find common elements between two HashSet objects.
    - Input: {1, 2, 3}, {2, 3, 4}
    - Output: {2, 3}
 */

package hashset.practice1.pkg;

import java.util.Arrays;
import java.util.HashSet;

public class Question4
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1 = new HashSet<Integer>(Arrays.asList(1,2,3));
		HashSet<Integer> h2 = new HashSet<Integer>(Arrays.asList(2,3,4));
		
		HashSet<Integer> intersection = new HashSet<Integer>(h1);
		intersection.retainAll(h2);
		
		System.out.println(intersection);
	}
}
