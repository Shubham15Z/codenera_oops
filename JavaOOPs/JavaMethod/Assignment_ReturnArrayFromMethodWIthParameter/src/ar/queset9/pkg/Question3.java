/*
Q11.Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the 
smallest number that is missing from the array. 

Examples:

Input: {0, 1, 2, 6, 9}, n = 5, m = 10 
Output: 3
 */

package ar.queset9.pkg;

public class Question3 
{
	int findMissingNumber(int a[], int n, int m)
	{
		for (int i = 0; i < n; i++) {
            if (a[i] != i) {
                return i;
            }
        }
        return n;
	}
	
	public static void main(String[] args) 
	{
		int a[] = {0, 1, 2, 6, 9};
		int n = 5, m = 10;
		Question3 ob = new Question3();
		int result = ob.findMissingNumber(a, n, m);
		System.out.println("The missing number is : "+result);
	}
}
