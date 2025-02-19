package ar.queset7.pkg;

import java.util.Arrays;

public class Question4 
{
	int [] findProduct(int nums1[])
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
		int nums1[] = { 1, 2, 3, 4, 5, 6, 7};
//		int nums1[] = {0, 1, 2, 3, 4, 5, 6, 7};
		Question4 ob = new Question4();
		int num [] = ob.findProduct(nums1);
		System.out.println("Elements in array after product with every other element except itself : ");
		System.out.println(Arrays.toString(num));
	}
}
