/*
Q14
Q10.Wap input an array now insert any element at any position ,
    element and position is taken by user. 
 */

package ar.queset5.pkg;

import java.util.Scanner;

public class Question14 
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
	void inserElement(int a[], int pos, int ele)
	{
		for(int i = 0; i < a.length; i++)
		{
				a[pos-1] = ele;
		}
		System.out.println("\nThe array elements after inserting new elements are : ");
		for(int i = 0; i < a.length; i++)
		{
				System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Question14 ob = new Question14();
		int [] a1 = ob.addElement();
		System.out.println("\nEnter position to add element :");
		int pos = sc.nextInt();
		System.out.println("Enter new element : ");
		int ele = sc.nextInt();
		ob.inserElement(a1,pos,ele);
	}
}
