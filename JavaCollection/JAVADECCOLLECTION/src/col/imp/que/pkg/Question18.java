/*
18. Closest Lower Element  
    - Question: Find the closest lower element to a given key in a TreeSet.
    - Input: [3, 6, 9, 12], key = 8
    - Output: 6
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.TreeSet;

public class Question18 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> set1 = new TreeSet<Integer>(Arrays.asList(3,6,9,12));
		
		System.out.println( set1.lower(8));
	}
}
