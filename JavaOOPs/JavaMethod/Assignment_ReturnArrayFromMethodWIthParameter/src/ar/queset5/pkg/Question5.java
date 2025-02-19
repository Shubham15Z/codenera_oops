/*
Q5.Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
If there is such a triplet present in array, then print the triplet and return true. Else return false.

Examples: 
 
Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9
 */

package ar.queset5.pkg;

public class Question5 
{	
	boolean isTripletFound(int a[], int sum)
	{
		for(int i = 0; i <a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				for(int k = j+1; k <a.length; k++)
				{
					if(a[i]+a[j]+a[k] == sum)
					{
						System.out.print("\nTriplet pair is : "+a[i]+" , "+a[j]+" , "+a[k]);
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) 
	{
		int a[] = {12, 3, 4, 1, 6, 9};
		int sum = 24;
		Question5 ob = new Question5();
		boolean triplet = ob.isTripletFound(a, sum);
		System.out.println("\n"+triplet);
	}
}
