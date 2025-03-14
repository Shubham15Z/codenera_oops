/*
3.Given an array (or string), the task is to reverse the array/string.
  Examples : 
 Input  : arr[] = {1, 2, 3}
 Output : arr[] = {3, 2, 1}
 */

package dec.java.array.practice.pkg;

import java.util.Arrays;

public class Question3 
{
	void reverseArray(int[] a)
	{
		int[] rev = new int[a.length];
		
		for(int i = 0; i < a.length; i++)
		{
			rev[i] = a[a.length-i-1];
		}
		System.out.println(Arrays.toString(rev));
	}
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3};
		Question3 q3 = new Question3();
		q3.reverseArray(arr);
	}
}
