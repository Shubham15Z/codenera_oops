/*
 Q2. Write a Java program to remove the duplicate elements of a given array and print the new length of the array.
    Sample array: [20, 20, 30, 40, 50, 50, 50]
    After removing the duplicate elements the program should return 4 as the new length of the array.
 */

package ar.queset4.pkg;

public class Question2 {
	int removeDuplicate(int a[])
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

		int length=0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != -1)
			{
				length++;
			}
		}
		return length;
	}
	
	public static void main(String args[])
	{
		int a[] = {20, 20, 30, 40, 50, 50, 50};
		Question2 ob = new Question2();
		int result = ob.removeDuplicate(a);
		System.out.println("The length of new array is : "+result);
	}
}
