/*
 Q1.You are given two arrays, A and B, of equal size N. The task is to find the minimum value of 
 A[0] * B[0] + A[1] * B[1] + .... + A[N-1] * B[N-1], where shuffling of elements of arrays A and B is allowed.

Example 1:
Input:
N = 3 
A[] = {3, 1, 1}
B[] = {6, 5, 4}
Output:
23
 */

package wt.feb8.pkg;

public class Question1 {
	
	int minimumProduct(int a[], int b[])
	{
		int minProd = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++)
		{
			minProd = minProd + (a[i]*b[i]);
		}
		
		return minProd;
	}
	
	public static void main(String args[])
	{
		Question1 ob = new Question1();
		int A[] = {3, 1, 1};
		int B[] = {6, 5, 4};
		int result = ob.minimumProduct(A, B);
		System.out.println("The minimum value is : "+result);
	}
}
