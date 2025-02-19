/*
Q9.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e.
  the element that occurs more than once and whose index of the first occurrence is the smallest.
Examples:
  Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
  Output: 5
 */

package assignment.method1.pkg;

public class Question9 {
	void indexFirstRepeating()
	{
		int arr[] = {10, 5, 3, 4, 3, 5, 6};
		for(int i = 0; i < arr.length; i++)
		{
			int count = 0;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					System.out.println("The index of first repeating element is : "+j);
					break;
				}
			}
			if(count > 0)
			{
				break;
			}		
		}
	}
	
	public static void main(String args[])
	{
		Question9 ob = new Question9();
		ob.indexFirstRepeating();
	}
}
