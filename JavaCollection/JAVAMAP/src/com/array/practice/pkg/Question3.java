/*
3. Rotate Array Left by K Positions
- Input: [1, 2, 3, 4, 5], K = 2
- Output: [3, 4, 5, 1, 2]
 */

package com.array.practice.pkg;

import java.util.Arrays;

public class Question3 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int k = 2;
		
		
		for(int i = 1; i <= k; i++)
		{
			int temp = arr[0];
			for(int j = 0; j < arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
		
		
		System.out.println(Arrays.toString(arr));
	}
}
