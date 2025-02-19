/*
 Q7.Wap input an array and rotate it in clock wise by any no give by user.
 */

package ar.queset5.pkg;

import java.util.Scanner;

public class Question11 
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
	void rotateArray(int a[], int rotation)
	{
		for(int j = 1; j <= rotation; j++)
		{
			int temp = a[a.length-1];
			for(int i = a.length-1; i > 0; i--)
			{
				a[i] = a[i-1];
			}
			a[0] = temp;
		}
		System.out.println("The array after rotation is : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Question11 ob = new Question11();
		int [] a1 = ob.addElement();
		System.out.println("\nEnter the number of clock wise rorations : ");
		int rotation = sc.nextInt();
		ob.rotateArray(a1, rotation);
		
	}
}
