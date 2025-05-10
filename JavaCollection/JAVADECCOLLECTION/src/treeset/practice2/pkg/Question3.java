/*
18. Closest Lower Element  
    - Question: Find the closest lower element to a given key in a TreeSet.
    - Input: [3, 6, 9, 12], key = 8
    - Output: 6
 */

package treeset.practice2.pkg;

import java.util.Arrays;
import java.util.TreeSet;

public class Question3 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t1 = new TreeSet<Integer>(Arrays.asList(3, 6, 9, 12));
		int key = 8;
		
		System.out.println(t1.lower(key));
	}
}
