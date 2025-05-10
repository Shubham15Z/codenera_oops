/*
8.Add elements from an array into a LinkedHashSet and print the set.
 */

package linkedhashset.pkg;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Question8 
{
	public static void main(String[] args) 
	{
		Integer[] arr = {10,30,20,35,55};
		
		LinkedHashSet l1 = new LinkedHashSet();
		
		for(int num : arr)
		{
			l1.add(num);
		}
		System.out.println(l1);
		
		LinkedHashSet l2 = new LinkedHashSet(Arrays.asList(arr));
		System.out.println(l2);
		
	}
}
