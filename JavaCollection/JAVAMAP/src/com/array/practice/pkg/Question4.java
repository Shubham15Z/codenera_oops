/*
4. Find All Unique Triplets That Sum to Zero
- Input: [-1, 0, 1, 2, -1, -4]
- Output: [[-1, -1, 2], [-1, 0, 1]]
 */

package com.array.practice.pkg;

public class Question4
{
	public static void main(String[] args) 
	{
		int[] arr = {-1,0,1,2,-1,-4};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				for(int k = j+1; k < arr.length; k++)
				{
					if(arr[i]+arr[j]+arr[k] == 0)
					{
						System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
					}
				}
			}
		}
	}
}
