/*
Q3.Given an array of size N filled with numbers from 1 to N-1 in random order. The array has only one repetitive element. 
The task is to find the repetitive element.

Examples:

Input: a[] = {1, 3, 2, 3, 4}
Output: 3
 */

package wt.feb8.pkg;

public class Question3 {
	int findRepetativeElement(int a[])
	{
		int ele = 0;
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;	
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					ele = a[i];
					count++;
				}	
			}
			if(count > 0)
			{
				break;
			}	
		}
		return ele;
	}
	
	public static void main(String args[])
	{
		Question3 ob = new Question3();
		int a[] = {1, 3, 2, 3, 4};
		int result = ob.findRepetativeElement(a);
		System.out.println("The repetative element is : "+result);
		
	}
}
