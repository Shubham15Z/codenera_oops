/*
16. Find Range  
    - Question: Given a TreeSet, find all elements within a specific range.
    - Input: [1, 3, 5, 7, 9], range: 3 to 8
    - Output: [3, 5, 7]
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Question16
{
	public static void main(String[] args)
	{
		TreeSet<Integer> set1 = new TreeSet<Integer>(Arrays.asList(1,3,5,7,8));
		
		System.out.println(set1);
		System.out.println(set1.subSet(3, 8));
	}
}
