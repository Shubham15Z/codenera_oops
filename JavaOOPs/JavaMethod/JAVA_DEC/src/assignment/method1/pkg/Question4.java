/*
Q4.Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array.
The functions should put all 0s first, then all 1s and all 2s in last.
 */
package assignment.method1.pkg;

public class Question4 {
	void sortAscending()
	{
		int arr[] = {1, 0, 1, 2, 0, 0, 2, 2, 1, 2, 0, 1};
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		System.out.println("The array after sorting is : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Question4 ob = new Question4();
		ob.sortAscending();
	}
}
