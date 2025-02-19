/*
Q.5Write a Java program to check if an array of integers contains two specified elements 65 and 77.

 */

package ar.queset4.pkg;

public class Question5 {
	boolean checkSpecifiedElement(int a[], int n1, int n2)
	{
		boolean found1 = false;
		boolean found2 = false;

		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == n1)
			{
				found1 = true;
			}
			if(a[i] == n2)
			{
				found2 = true;
			}
			if(found1 && found2)
			{
				break;
			}
		}

		if(found1 && found2) 
		{
            return true;
        } 
		 
		else 
		{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		int a[] = {55, 45, 60, 35, 50, 65, 20, 77};
		int n1 = 65;
		int n2 = 77;
		Question5 ob = new Question5();
		boolean found = ob.checkSpecifiedElement(a, n1, n2);
		System.out.println(found);
	}
}
