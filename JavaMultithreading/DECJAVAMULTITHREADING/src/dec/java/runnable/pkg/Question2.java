/*
8. Find the Most Frequent Element in an Array
   Problem Description:  
   Write a Java program to find the most frequent element in an array using HashMap.

   Input: An array of integers.  
   Output: The most frequent element.

   Example:
   - Input: [1, 3, 2, 3, 4, 3, 5]
   - Output: 3
 */

package dec.java.runnable.pkg;

class MyThread02 implements Runnable
{

	public void mostFrequent()
	{
		int[] a = {1,3,2,3,4,3,5};
		int mostFrequent = a[0];
		int maxCount = 1;
		
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
			}
			if(count > maxCount)
			{
				maxCount = count;
				mostFrequent = a[i];
			}
		}
		
		System.out.println("Most Frequent Element is : "+mostFrequent);
	}
	
	@Override
	public void run()
	{
		mostFrequent();
	}
	
}
public class Question2 
{
	public static void main(String[] args) 
	{
		MyThread02 mt02 = new MyThread02();
		
		Thread t02 = new Thread(mt02);
		
		t02.start();
	}
}
