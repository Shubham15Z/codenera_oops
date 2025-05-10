/*
25. Remove Elements by Condition  
    - Question: Remove all elements from a HashSet greater than a given threshold.
    - Input: {1, 2, 3, 4, 5}, threshold = 3
    - Output: {1, 2, 3}
 */

package hashset.practice1.pkg;

import java.util.Arrays;
import java.util.HashSet;

public class Question5
{
	public static void main(String[] args)
	{
		HashSet<Integer> h1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		int threshold = 3;
		
		h1.removeIf(num -> num > threshold);
		
		System.out.println(h1);
	}
}
