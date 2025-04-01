/*
Q3.Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements
after it.

Note: Retun the index of Equilibrium point. (1-based index)

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
 */

package dec.java.threading.practice1.pkg;

class MyThread3 extends Thread
{
	public void run()
	{
		int A[] = {1,3,5,2,2};
		
		for(int i = 0; i < A.length; i++)
		{
			int leftSum = 0;
			int rightSum = 0;
			for(int j = 0; j < i; j++)
			{
				leftSum += A[j];
			}
			
			for(int j = i+1; j < A.length; j++)
			{
				rightSum += A[j];
			}
			
			if(leftSum == rightSum)
			{
				System.out.println("Equilibrium point is : "+(i+1));
			}

		}
	}
}

public class Question3 
{
	public static void main(String[] args) {
		MyThread3 t3 = new MyThread3();
		t3.start();
	}

}
