/*
6.Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].
  Expected time complexity is O(Logn) 
  Examples: 
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]
 */

package dec.java.array.practice.pkg;

public class Question6 
{
	void countOccurence(int[] a, int x)
	{
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == x)
				count++;
		}
		System.out.println(x+" occurs "+count+" times in arr[1, 1, 2, 2, 2, 2, 3]");
	}
	public static void main(String[] args) 
	{
		int arr[] = {1, 1, 2, 2, 2, 2, 3,};
		int x = 2;
		
		Question6 q6 = new Question6();
		q6.countOccurence(arr, x);
	}
}
