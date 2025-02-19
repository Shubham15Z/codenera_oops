/*
 Q1.Write a Java program to check if an array of integers without 0 and -1.
 
 int removeDuplicate()
	{
		
	}
	
	public static void main(String args[])
	{
		int a[] = {12,45,7,3,9};
		Question1 ob = new Question1();
		String result = ob.checkArrayElements(a);
		System.out.println(result);
	}
 */

package ar.queset4.pkg;

public class Question1 {
	String checkArrayElements(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;
			if(a[i] == 0 || a[i] == -1)
			{
				count++;
			}
			
			if(count > 0)
			{
				return "It contains 0 and -1";
			}
		}
		return "Does not contain 0 and -1";
	}
	public static void main(String args[])
	{
		int a[] = {12,45,7,3,9};
		Question1 ob = new Question1();
		String result = ob.checkArrayElements(a);
		System.out.println(result);
	}
}
