/*
17. Get First and Last Element  
    - Question: Retrieve the first and last element from a TreeSet.
    - Input: [2, 4, 6, 8]
    - Output: First: 2, Last: 8
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.TreeSet;

public class Question17 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> set1 = new TreeSet<Integer>(Arrays.asList(2,4,6,8));
		
		System.out.println("First : "+set1.getFirst());
		System.out.println("Last : "+set1.getLast());
	}
}
