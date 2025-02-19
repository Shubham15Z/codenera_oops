/*
Q1.Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors.
Note: For corner elements, we need to consider only one neighbor.
Example:
Input: array[]= {5, 10, 20, 15}
Output: 20 
 */
package assignment.method1.pkg;
 
public class Question1 {
	
	void peakElement()
	{
		int array[]= {5, 10, 20, 15};
		int peak = array[0];
		System.out.println("The peak elements are : ");
		for(int i = 1; i < array.length-1; i++)
		{
			if(array[i]>array[i-1] && array[i]>array[i+1])
			{
				System.out.print(array[i]+" ");
			}		
		}
	}
	public static void main(String args[])
	{
		Question1 ob = new Question1();
		ob.peakElement();
	}
}
