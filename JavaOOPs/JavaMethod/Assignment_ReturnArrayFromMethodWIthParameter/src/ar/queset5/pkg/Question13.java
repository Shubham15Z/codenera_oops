/*
Q13
Q9. Write a Java program to find max number in an array.

 */

package ar.queset5.pkg;

public class Question13 
{
	int findMaximum(int a[]) {
		int max = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		Question13 ob = new Question13();
		int [] a={9,1,3,5,6,11,22,66,10,19};
		int result = ob.findMaximum(a);
		System.out.println("The max array element is : "+result);
	}
}
