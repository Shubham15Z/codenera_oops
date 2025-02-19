/*
Q5.Wap input an array now delete  element from array, position is taken from user.
 */

package ar.queset5.pkg;

import java.util.Scanner;

public class Question9 
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
	void deleteElement(int a[], int pos)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(i == pos-1)
			{
				a[i] = -1;
			}
		}
		System.out.println("The array after deleting element is : ");
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
		Question9 ob = new Question9();
		int [] a1 = ob.addElement();
		System.out.println("\nEnter the element position from which need to delete from the given array: ");
		int pos = sc.nextInt();
		ob.deleteElement(a1, pos);
		
	}

}
