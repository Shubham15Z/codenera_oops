/*
5. Find the Duplicate Element in an Array
- Input: [1, 3, 4, 2, 2]
- Output: 2
 */

package com.array.practice.pkg;

public class Question5 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,3,4,2,2};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+", ");
				}
			}
		}
	}
}
