/*
Q8.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
Examples:
Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80
 */
package assignment.method1.pkg;

public class Question8 {
	void commonElement()
	{
		int a[] = {1, 5, 10, 20, 40, 80};
		int b[] = {6, 7, 20, 80, 100};
		int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
		System.out.println("The common elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b.length; j++)
			{
				for(int k = 0; k < c.length; k++)
				{
					if(a[i] == b[j] && a[i] == c[k])
					{
						System.out.print(a[i]+" ");
						break;
					}
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		Question8 ob = new Question8();
		ob.commonElement();
	}
}
