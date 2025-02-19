/*
Q5.Given two sorted arrays, find their union and intersection.
Example:

 Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6}
 Output: Union : {1, 2, 3, 4, 5, 6, 7}
         Intersection : {3, 5}
 */

package assignment.method1.pkg;

public class Question5 {
	void unionIntersection()
	{
		int a[] = {1, 3, 4, 5, 7};
		int b[] = {2, 3, 5, 6};
		System.out.println("The Union elements are : ");
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
		
		System.out.println();
		System.out.println("The intersection elements are : ");
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
		Question5 ob = new Question5();
		ob.unionIntersection();
	}
}
