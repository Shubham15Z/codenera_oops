/*
3. Rotate ArrayList  
   - Question: Rotate an ArrayList of integers by k steps.
   - Input: [1, 2, 3, 4, 5], k = 2
   - Output: [4, 5, 1, 2, 3]
 */

package col.imp.que.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3
{
	
	public static List<Integer> rotateList(List<Integer> list1, int k)
	{
		for(int j = 1; j <= k; j++)
		{
			int temp = list1.getLast();
			for(int i = list1.size()-1; i > 0; i--)
			{
				list1.set(i, list1.get(i-1));
			}
			list1.set(0, temp);
		}
		return list1;
	}
	
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		int k = 2;
		List<Integer> res = rotateList(list1,k);
		System.out.println(res);
	}
}
