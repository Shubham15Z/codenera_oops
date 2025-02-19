/*
 Q11.Given an unsorted array arr[] with both positive and negative elements, the task is to find the smallest positive 
 number missing from the array.
  Note: You can modify the original array.
  Examples:
  Input:  arr[] = {2, 3, 7, 6, 8, -1, -10, 15}
  Output: 1
 */

package ar.queset9.pkg;

import java.util.Arrays;

public class Question2 {
	
	int findMissingNumber(int a[])
	{
		Arrays.sort(a);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int c = 1;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] <= 0)
			{
				continue;
			}
			if(a[i] == c)
			{
				c++;
			}
			else
			{
				return c;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args)
	{
		 int a[] = {2, 3, 7, 6, 8, -1, -10, 15};
		 Question2 ob = new Question2();
		 int result = ob.findMissingNumber(a);
		 System.out.println("The missing number is : "+result);
	}
}
