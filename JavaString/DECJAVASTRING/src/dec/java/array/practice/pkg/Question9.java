/*
9.An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative 
  numbers appear before all positive numbers.
  Examples : 
  Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
  Output: -12 -13 -5 -7 -3 -6 11 6 5
 */

package dec.java.array.practice.pkg;

import java.util.Arrays;

public class Question9 
{
	void arrangeEle(int[] a)
	{
		int[] b = new int[a.length];
		int x = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] < 0)
				b[x++] = a[i];
		}
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > 0)
				b[x++] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args) 
	{
		int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		Question9 q9 = new Question9();
		q9.arrangeEle(arr);
	}
}
