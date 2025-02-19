/*
Q2.Given an array and a number K where K is smaller than the size of the array.
Find the K’th smallest element in the given array. Given that all array elements are distinct.
Examples:  
Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
Output: 7
 */

package assignment.method1.pkg;

public class Question2 {
	
	void kSmallerElement()
	{
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
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
		System.out.println("The "+k+" th Smallest element is : "+arr[k-1]);
	}
	public static void main(String args[])
	{
		Question2 ob = new Question2();
		ob.kSmallerElement();
	}
}
