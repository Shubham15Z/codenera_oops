/*
5.Given an array and a number K where K is smaller than the size of the array. Find the K’th smallest element in the given array. 
  Given that all array elements are distinct.
  Examples:  
  Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
  Output: 7
 */

package dec.java.array.practice.pkg;

import java.util.Arrays;

public class Question5 
{
	void kthSmallest(int[] a, int k)
	{
		Arrays.sort(a);
		System.out.println(k+" th smallest element is : "+a[k-1]);
	}
	public static void main(String[] args)
	{
		int arr[] = {7, 10, 4, 3, 20, 15};
		int K = 3;
		Question5 q5 = new Question5();
		q5.kthSmallest(arr, K);
	}
}
