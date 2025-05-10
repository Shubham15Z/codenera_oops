/*
17. Get First and Last Element  
    - Question: Retrieve the first and last element from a TreeSet.
    - Input: [2, 4, 6, 8]
    - Output: First: 2, Last: 8
 */

package treeset.practice2.pkg;

import java.util.Arrays;
import java.util.TreeSet;

public class Question2 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t1 = new TreeSet<Integer>(Arrays.asList(2, 4, 6, 8));
		System.out.println(t1);
		System.out.println("first element : "+t1.getFirst());
		System.out.println("last element : "+t1.getLast());
	}
}
