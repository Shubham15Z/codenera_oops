/*
2.Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
 
   Example 1:
   Input:
   N = 6
   A[] = {3, 2, 1, 56, 10000, 167}
   Output:
   min = 1, max =  10000
 */

package dec.java.array.practice.pkg;

import java.util.Arrays;

public class Question2 
{
	Question2()
	{
		
	}
	
	void findMinMax(int[] a)
	{
		Arrays.sort(a);
		System.out.println("Min element is : "+a[0]);
		System.out.println("Max element is : "+a[a.length-1]);
	}
	
	public static void main(String[] args) 
	{
		int[] A = {3, 2, 1, 56, 10000, 167};
		Question2 q2 = new Question2();
		q2.findMinMax(A);
		
	}
}
