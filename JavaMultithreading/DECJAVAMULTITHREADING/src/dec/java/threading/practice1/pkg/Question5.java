/*
Q5.Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. 
The task is to find the element that would be at the k’th position of the final sorted array.
 

Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
 */

package dec.java.threading.practice1.pkg;

import java.util.Arrays;

class MyThread5 extends Thread
{
	public void run()
	{
		int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		int k = 5;
		
		int arr3[] = new int[arr1.length+arr2.length];
		
		for(int i = 0; i < arr1.length; i++)
		{
			arr3[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr3));
		for(int i = 0; i < arr2.length; i++)
		{
			arr3[i+arr1.length] = arr2[i];
		}
		
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("The element at given position is : "+arr3[k-1]);
	}
}

public class Question5 
{
	public static void main(String[] args) {
		MyThread5 t5 = new MyThread5();
		t5.start();
	}
}
