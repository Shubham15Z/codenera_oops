/*
Q6.Given an array of integers. All numbers occur twice except one number which occurs once. 
Find the number in O(n) time & constant extra space.

Example : 

Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2 
 */

package wt.feb8.pkg;

public class Question6 {
	int findUnique(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;	
			for(int j = 0; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}	
			}
			if(count == 1)
			{	
				return a[i];
			}	
		}
		return -1;
	}
	public static void main(String args[])
	{
		Question6 ob = new Question6();
		int a[] = {2, 3, 5, 4, 5, 3, 4};
		int result = ob.findUnique(a);
		System.out.println("The element which occurs once is : "+result);
	}
}
