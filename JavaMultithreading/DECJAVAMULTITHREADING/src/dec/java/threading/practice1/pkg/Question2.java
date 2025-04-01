/*
Q2.Given an array A of positive integers. Your task is to find the leaders in the array. 
An element of array is leader if it is greater than or equal to all the elements to its right side. 
The rightmost element is always a leader. 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
 */

package dec.java.threading.practice1.pkg;

class MyThread2 extends Thread
{
	public void run()
	{
		int A[] = {16,17,4,3,5,2};
		
		for(int i = 0; i < A.length; i++)
		{
			boolean isLeader = false;
			int leader = A[i];
			for(int j = i; j < A.length; j++)
			{
				if(leader >= A[j])
				{
					isLeader = true;
				}
				else
				{
					isLeader = false;
					break;
				}
			}
			if(isLeader)
			{
				System.out.print(leader+" ");
			}
			
		}
	}
}
public class Question2 
{
	public static void main(String[] args) {
		MyThread2 t2 = new MyThread2();
		t2.start();
	}
}
