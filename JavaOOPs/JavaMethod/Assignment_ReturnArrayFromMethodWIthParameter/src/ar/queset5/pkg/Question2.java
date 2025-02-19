/*
Q2.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e.
   the element that occurs more than once and whose index of the first occurrence is the smallest. 
 */

package ar.queset5.pkg;

public class Question2 
{
	int findIndex(int a[])
	{
		int c = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					c++;
				}
			}
			if(c > 0)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{	
		Question2 ob = new Question2();
		int a[] = {1,3,7,2,6,2};
		int result = ob.findIndex(a);
		System.out.println("The index of 1st reapeting element is : "+result);
	}
}
