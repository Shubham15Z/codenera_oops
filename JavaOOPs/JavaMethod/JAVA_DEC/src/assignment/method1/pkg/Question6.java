/*
Q6.Given an array, cyclically rotate the array clockwise by one.

Examples:  

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
 */

package assignment.method1.pkg;

public class Question6 {
	void cyclicRotate()
	{
		int arr[] = {1, 2, 3, 4, 5};
		int temp = arr[arr.length-1];
		for(int i = arr.length-1; i > 0; i--)
		{
			arr[i] = arr[i-1];	
		}
		arr[0] = temp;
		System.out.println("The array element after cyclically rotate any array bye one are : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Question6 ob = new Question6();
		ob.cyclicRotate();
	}
}
