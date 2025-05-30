/*
1. Find the Maximum Product of Two Elements
- Input: [1, 4, 3, 7, 6]
- Output: 28 (Product of 4 and 7)
 */

package com.array.practice.pkg;

import java.util.Arrays;
import java.util.List;

public class Question1 
{
	public static void main(String[] args)
	{
		int[] arr = {1,4,3,7,6};
		
		Arrays.sort(arr);
		
		int maxProd = arr[arr.length-1] * arr[arr.length-2];
		
		System.out.println("Maximum product : "+maxProd);
		
	}
}
