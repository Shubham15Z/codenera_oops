/*
Q10.Write a Java program to replace each element of the array with product of every other element in a given array of 
integers.

Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7}
nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
Output:
Array with product of every other element:
[5040, 2520, 1680, 1260, 1008, 840, 720]
Array with product of every other element:
[5040, 0, 0, 0, 0, 0, 0, 0]
 */
package wt.feb8.pkg;

import java.util.Arrays;

public class Question10 
{
	int [] productReplace(int nums1[])
	{
		int product = 1;
		int zeroCount = 0;

		for(int i = 0; i < nums1.length; i++)
		{
			if(nums1[i] != 0)
			{
				product = product * nums1[i];
			}
			else
			{
				zeroCount++;
			}
		}

		int nums3[] = new int [nums1.length];
		for(int i = 0; i < nums3.length; i++)
		{
			if(zeroCount > 1)
			{
				nums3[i] = 0;
			}
			else if(zeroCount == 1)
			{
				if(nums1[i] == 0)
				{
					nums3[i] = product;
				}
				else
				{
					nums3[i] = 0;
				}
			}
			else
			{
				nums3[i] = product/nums1[i];
			}
		}
		return nums3;
	}
	public static void main(String[] args) 
	{
		Question10 ob = new Question10();
		int nums1[] = { 1, 2, 3, 4, 5, 6, 7}; 
//		int nums1[] = {0, 1, 2, 3, 4, 5, 6, 7};
		System.out.println("Elements in array after product with every other element except itself : ");
		int nums03[] = ob.productReplace(nums1);
		System.out.println(Arrays.toString(nums03));
	}
}
