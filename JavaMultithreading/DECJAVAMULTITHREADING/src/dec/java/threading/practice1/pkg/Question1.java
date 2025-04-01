/*
Q1.Given an array of N integers. Find the first element that occurs at least K number of times.
 
Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
7
 */

package dec.java.threading.practice1.pkg;
class MyThread1 extends Thread
{
	public void run()
	{
		int A[] = {1, 7, 4, 3, 4, 8, 7};
		int k = 2;
		
		for(int i = 0; i < A.length; i++)
		{
			int count = 1;
			for(int j = i+1; j < A.length; j++)
			{
				if(A[i] == A[j])
				{
					count++;
				}
			}
			if(count >= k)
			{
				System.out.println(A[i]);
				break;
			}
		}
	}
}

public class Question1 
{
	public static void main(String[] args)
	{
		MyThread1 t1 = new MyThread1();
		t1.start();
	}
}
