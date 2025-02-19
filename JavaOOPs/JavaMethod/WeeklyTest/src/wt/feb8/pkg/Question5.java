/*
Q5.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples: 

Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80
 */
package wt.feb8.pkg;

public class Question5 {
	void findCommon(int arr1[], int arr2[], int arr3[])
	{
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length; j++)
			{
				for(int k = 0; k < arr3.length; k++)
				{
					if(arr1[i] == arr2[j] && arr1[i] == arr3[k])
					{
						System.out.print(arr1[i]+", ");
					}
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		Question5 ob = new Question5();
		int arr1[] = {1, 5, 10, 20, 40, 80};
		int arr2[] = {6, 7, 20, 80, 100};
		int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		System.out.println("The Common elements in array are : ");
		ob.findCommon(arr1, arr2, arr3);
	}
}
