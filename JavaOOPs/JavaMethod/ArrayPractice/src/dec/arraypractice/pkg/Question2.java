/*
Q9.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e. 
  the element that occurs more than once and whose index of the first occurrence is the smallest. 

Examples: 

  Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
  Output: 5
 */

package dec.arraypractice.pkg;

class RepeatingElement
{
	int repeatingElement(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					return j;
				}	
			}
		}
		return -1;
	}
}
public class Question2 
{
	public static void main(String[] args) 
	{
		int arr[] = {10, 5, 3, 4, 3, 5, 6};
		RepeatingElement rp = new RepeatingElement();
		int res = rp.repeatingElement(arr);
		System.out.println("index is "+res);
	}
}
