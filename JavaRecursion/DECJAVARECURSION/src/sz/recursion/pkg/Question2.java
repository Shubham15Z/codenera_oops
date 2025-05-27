/*
2. Calculate the sum of elements in an integer array using recursion.
 */

package sz.recursion.pkg;

public class Question2 
{
	public static int calSum(int[] arr, int i)
	{
		if(arr.length > i)
		{
			return arr[i]+ calSum(arr, i+1);
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int sum = calSum(arr, 0);
		
		System.out.println("Sum is : "+sum);
	}
}
