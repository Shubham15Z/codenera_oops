/*
Q4.Given an array of N integers, and a number sum, the task is to find the number of pairs of integers 
in the array whose sum is equal to sum.

Examples:  

Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2
 */

package ar.queset5.pkg;

public class Question4 
{
	int findPair(int a[], int sum)
	{
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i]+a[j] == sum)
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		int a[] = {1, 5, 7, -1};
		int sum = 6;
		Question4 ob = new Question4();
		int result = ob.findPair(a, sum);
		System.out.println("The number of pairs are : "+result);	
	}
}
