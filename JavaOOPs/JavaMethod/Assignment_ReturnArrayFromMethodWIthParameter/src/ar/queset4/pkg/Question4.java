/*
Q4.Write a Java program to print all the LEADERS in the array.
  Note: An element is leader if it is greater than all the elements to its right side.
int a[] = {20,1,30,9,2,4,5,6};
 */

package ar.queset4.pkg;

public class Question4 {
	int [] printLeader(int a[])
	{
		System.out.println("The array elements are : ");
		for(int j = 0; j < a.length; j++)	
		{
			System.out.print(a[j]+" ");
		}

		System.out.println();
		System.out.println("The leader elements are : ");
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			int j;
			for(j = i+1; j < a.length; j++)
			{
				if(a[i] <= a[j])
				{
					break;
				}
			}
			if(j == a.length)
			{
				count++;
			}
		}
		return a;
	}
	
	public static void main(String args[])
	{
		int a[] = {20,1,30,9,2,4,5,6};
		
	}
}
