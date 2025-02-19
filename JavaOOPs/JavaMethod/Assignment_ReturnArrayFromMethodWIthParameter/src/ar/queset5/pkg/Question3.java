/*
Q.3 Find the majority element in the array. A majority element in an array A[] of size n is an element 
   that appears more than n/2 times (and hence there is at most one such element). 

Examples : 

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 
 */

package ar.queset5.pkg;

public class Question3 
{
	int findMajorityElement(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			int count = 1;
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
			}
			if(count > a.length/2)
			{
				return a[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Question3 ob = new Question3();
		int a[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int result = ob.findMajorityElement(a);
		System.out.println("The majority element is : "+result);
	}

}
