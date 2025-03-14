/*
1.Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 
   Note: For corner elements, we need to consider only one neighbor. 
   Example:
   Input: array[]= {5, 10, 20, 15}
   Output: 20
   Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
 */

package dec.java.array.practice.pkg;

import java.util.Scanner;

public class Question1
{
	Question1()
	{

	}
	
	void peakElement(int[] a) 
	{
		if(a[0] > a[1]) 
			System.out.print(a[0]+" ");
		
		for(int i = 1; i < a.length-1; i++)
		{
			if(a[i] > a[i-1] && a[i] > a[i+1])
				System.out.print(a[i]+" ");
		}
		
		if(a[a.length-1] > a[a.length-2])
			System.out.print(a[a.length-1]);
	}
	
	public static void main(String[] args)
	{
		int array[]= {12, 10, 30, 20, 25};
		Question1 q1 = new Question1();
		q1.peakElement(array);
	}
}
