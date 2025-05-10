/*
16. Find Range  
    - Question: Given a TreeSet, find all elements within a specific range.
    - Input: [1, 3, 5, 7, 9], range: 3 to 8
    - Output: [3, 5, 7]
 */

package treeset.practice2.pkg;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Question1 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t1 = new TreeSet<Integer>(Arrays.asList(1,3,5,7,9));
		
		System.out.println(t1);
		
		SortedSet<Integer> t2 = t1.subSet(3,8);
		
		System.out.println(t2);
	}
}
