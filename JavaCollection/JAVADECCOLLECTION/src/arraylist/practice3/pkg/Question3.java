/*
3. Rotate ArrayList  
   - Question: Rotate an ArrayList of integers by k steps.
   - Input: [1, 2, 3, 4, 5], k = 2
   - Output: [4, 5, 1, 2, 3]
 */

package arraylist.practice3.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3
{
	public static void main(String[] args)
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(l1);
		int k = 2;
		
		for(int j = 1; j <= k; j++)
		{
			int temp = l1.getLast();
			for(int i = l1.size()-1; i > 0; i--)
			{
				l1.set(i, l1.get(i-1));
			}
			l1.set(0, temp);
		}
		System.out.println(l1);
	}
}
