/*
8. Move All Zeroes to the End
- Input: [0, 1, 0, 3, 12]
- Output: [1, 3, 12, 0, 0]
 */

package com.array.practice.pkg;

import java.util.Arrays;

public class Question8
{
	public static void main(String[] args) 
	{
		int[] arr = {0,1,0,3,12};
		
		int index = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != 0)
			{
				arr[index++] = arr[i];
			}
		}
		
		for(int i = index; i < arr.length; i++)
		{
			arr[i] = 0;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
