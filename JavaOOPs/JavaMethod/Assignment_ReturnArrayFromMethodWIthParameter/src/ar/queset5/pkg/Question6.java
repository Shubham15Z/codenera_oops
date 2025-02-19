/*
Q3.a[]={10,20,30,40,50}
   b[]={1,2,3,4,5}
 
  output array=c[]={10,5,20,4,30,3,40,2,50,1}
 */

package ar.queset5.pkg;

import java.util.Arrays;

public class Question6 
{
	int [] printArray(int a[], int b[])
	{
		int c[] = new int [a.length+b.length];
		for(int i = 0; i <a.length; i++)
		{
			c[i*2] = a[i];
			c[i*2+1] = b[b.length-1-i];
		}
		return c;
	}
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
		int b[]={1,2,3,4,5};
		Question6 ob = new Question6();
		int c1[] = ob.printArray(a, b);
		System.out.println(Arrays.toString(c1));
	}
}
