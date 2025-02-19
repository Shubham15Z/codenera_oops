/*
 Q.6Write a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers.

 */

package ar.queset4.pkg;
import java.util.Arrays;

public class Question6 {
	int [] evenOddSeparate(int a[])
	{
		int start = 0, end = a.length - 1;
		while(start < end)
		{
			if(a[start] % 2 == 0)
			{
				start++;
			}
			else if(a[end] % 2 != 0)
			{
				end--;
			}
			else
			{
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
		}
		return a;
	}
	
	public static void main(String args[])
	{
		Question6 ob = new Question6();
		int a [] = {2,54,34,23,9,8,5};
		System.out.println(Arrays.toString(a));
		int a1[] = ob.evenOddSeparate(a);
		System.out.println(Arrays.toString(a1));
	}
}
