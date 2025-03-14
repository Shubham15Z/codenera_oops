/*
4.Given an array arr[] of size N, the task is to sort this array in ascending order in C.
   Examples: 
   Input: arr[] = {0, 23, 14, 12, 9}
   Output: {0, 9, 12, 14, 23}
 */

package dec.java.array.practice.pkg;

import java.util.Arrays;

public class Question4 
{
	void sortAscending(int[] a)
	{
		int[] C = new int[a.length];
		Arrays.sort(a);
		for(int i = 0; i < a.length; i++)
		{
			C[i] = a[i];
		}
		System.out.println(Arrays.toString(C));
	}
	public static void main(String[] args) 
	{
		int arr[] = {0, 23, 14, 12, 9};
		Question4 q4 = new Question4();
		q4.sortAscending(arr);
	}
}
