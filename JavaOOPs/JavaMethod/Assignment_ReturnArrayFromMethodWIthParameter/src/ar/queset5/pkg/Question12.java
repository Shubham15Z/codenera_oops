/*
Q8.Wap input an array and delete all duplicate element from array.
 */

package ar.queset5.pkg;

import java.util.Scanner;

public class Question12 
{
	int [] addElement()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int a[] = new int [size];
		System.out.println("Enter the elements in array : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("The elements in array are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		return a;
	}
	void deleteDuplicate(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					a[j] = -1;
				}
				
			}	
			
		}
		System.out.println("\nThe array elements after deleting duplicate: ");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != -1)
			{
				System.out.print(a[i]+" ");
			}	
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Question12 ob = new Question12();
		int [] a1 = ob.addElement();
		ob.deleteDuplicate(a1);
	}
}
