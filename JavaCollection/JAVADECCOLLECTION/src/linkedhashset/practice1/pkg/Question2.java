/*
2. Remove Duplicates from an Array
   Given an array of integers, write a program to remove all duplicates and retain the order of 
   elements using a LinkedHashSet.

 */

package linkedhashset.practice1.pkg;

import java.util.LinkedHashSet;
import java.util.Set;

public class Question2 
{
	public static void main(String[] args)
	{
		int[] arr = {12,4,7,3,2,9,4,2,12,50};
		
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		
		for(int num : arr)
		{
			set1.add(num);
		}
		
		System.out.println("Unique ELements : "+set1);
	}
}
