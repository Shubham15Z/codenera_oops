/*
10..Given two sorted arrays, find their union and intersection.
  Example:
  Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
  Output: Union : {1, 2, 3, 4, 5, 6, 7} 
         Intersection : {3, 5}
 */

package dec.java.array.practice.pkg;

public class Question10 
{
	void unionArray(int[] a, int[] b)
	{
		int i = 0, j = 0;
		for(; i < a.length && j < b.length; )
		{
			if(a[i] < b[j])
				System.out.print(a[i++]+" ");
			else if(a[i] > b[j])
				System.out.print(b[j++]+" ");
			else
			{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}		
		}
		
		for(; i < a.length; i++)
			System.out.print(a[i]+" ");
		for(; j < b.length; j++)
			System.out.print(b[j]+" ");
	}
	
	void intersectionArray(int[] a, int[] b)
	{
		for(int i = 0, j =0; i < a.length && j < b.length; )
		{
			if(a[i] < b[j])
			{
				i++;
			}
			else if(a[i] > b[j])
			{
				j++;
			}
			else
			{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        
        Question10 q10 = new Question10();
        q10.unionArray(arr1, arr2);
        System.out.println();
        q10.intersectionArray(arr1, arr2);
        
	}
}
