/*
6. Find the First Missing Positive Integer
- Input: [3, 4, -1, 1]
- Output: 2
 */


package com.array.practice.pkg;

public class Question6
{
	public static void main(String[] args)
	{
		int[] arr = {3,4,-1,1};
		int lastNum = 4;
		int posSum = 0;
		
		for(int n : arr)
		{
			if(n > 0)
			{
				posSum+=n;
			}
		}
		
		int totalPosSum = (lastNum * (lastNum+1)) /2 ;
		
		System.out.println("Missing number : "+(totalPosSum-posSum));
		
	}
}
