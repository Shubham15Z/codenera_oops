package ar.queset1.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
	int[] printArray(int a[])
	{
		return a;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Question1 ob = new Question1();
		
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int a[] = new int [size];
		
		System.out.println("Enter the elements in array : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		
		int a1[] = ob.printArray(a);
		System.out.println("The elements in array are : ");
		System.out.println(Arrays.toString(a1));
		
	}
}
