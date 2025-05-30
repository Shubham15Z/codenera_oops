/*
2. Find the Minimum Difference Between Any Two Elements
- Input: [3, 1, 4, 1, 5, 9]
- Output: 0 (Difference between two 1s)
 */

package com.array.practice.pkg;

public class Question2
{
	public static void main(String[] args) 
	{
		int[] arr = {3,1,4,1,5,9};
		
		int minDiff = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				int diff = Math.abs(arr[i]-arr[j]);
				if(diff < minDiff)
				{
					minDiff = diff;
				}
			}
		}
		
		System.out.println("Minimum Difference : "+minDiff);
	}
}
