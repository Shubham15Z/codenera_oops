/*
 Q4.Given two unsorted arrays that represent two sets (elements in every array are distinct), 
 find the union and intersection of two arrays.

Example: 

arr1[] = {7, 1, 5, 2, 3, 6} 
arr2[] = {3, 8, 6, 20, 7} 
Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and Intersection as {3, 6, 7}. 
Note that the elements of union and intersection can be printed in any order.

 */

package wt.feb8.pkg;

public class Question4 {
	
	void findUnion(int a[], int b[])
	{
		for(int i = 0; i< a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i = 0; i < b.length; i++)
		{	
			int count = 0;
			for(int j = 0; j < a.length; j++)
			{
				if(b[i] == a[j])
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				System.out.print(b[i]+" ");
			}
		}
	}
	
	void findIntersection(int a[], int b[])
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b.length; j++)
			{
				if(a[i] == b[j])
				{
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
	}
		
	
	
	public static void main(String args[])
	{
		Question4 ob = new Question4();
		int a[] = {1, 3, 4, 5, 7};
		int b[] = {2, 3, 5, 6};
		
		System.out.println("The Union elements are : ");
		ob.findUnion(a, b);
		System.out.println();
		System.out.println("The intersection elements are : ");
		ob.findIntersection(a, b);
		
	}
}
