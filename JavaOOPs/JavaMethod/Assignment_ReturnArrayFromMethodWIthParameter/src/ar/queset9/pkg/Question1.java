/*
 Q11. Find the Missing Number

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5
Explanation: The missing number between 1 to 8 is 5

 */
package ar.queset9.pkg;

public class Question1 {
	int findMissingNumber(int a[], int n)
	{
		int totalSum = n*(n+1)/2;
		System.out.println("Total Sum : "+totalSum);
		int arraySum = 0;
		for(int i = 0; i < a.length; i++)
		{
			arraySum = arraySum + a[i];
		}
		System.out.println("Array sum is : "+arraySum);
		return totalSum - arraySum;
	}
	public static void main(String[] args) 
	{
		int a[] = {1, 2, 4, 6, 3, 7, 8};
		int N = 8;
		Question1 ob = new Question1();
		int result = ob.findMissingNumber(a, N);
		System.out.println("The missing number is : "+result);
	}
}
