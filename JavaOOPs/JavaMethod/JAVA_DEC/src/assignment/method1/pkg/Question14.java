/*
Q14.Write a Java program to find maximum product of two integers in a given array of integers.

 Example:
 Input :
 nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
 Output:
 Pair is (7, 8), Maximum Product: 56
 */

package assignment.method1.pkg;

public class Question14 {
	void maxProduct()
	{
		int arr[] = { 2, 3, 5, 7, -7, 5, 8, -5 };
		int maxProd = 1;
		int num1 = 0, num2 = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				int prod = arr[i]*arr[j];
				if(prod> maxProd)
				{
					maxProd = prod;
					num1 = arr[i];
					num2 = arr[j];
				} 
			}	
		}
		System.out.println("The pair is ("+num1+", "+num2+"), Maximum product : "+maxProd);
	}
	
	public static void main(String args[])
	{
		Question14 ob = new Question14();
		ob.maxProduct();
	}
}
