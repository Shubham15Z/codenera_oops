/*
Q9.Write a Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.  

Example:
Input :
nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 }
Output:
Array with every second element is greater than its left and right elements:
[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]
 */

package wt.feb8.pkg;

public class Question9 {
	
	void rearrangeArray(int nums[])
	{
		for(int j = 1; j < nums.length; j+=2)
		{
			if(j>0 && nums[j] < nums[j-1])
			{
				int temp = nums[j];
				nums[j] = nums[j-1];
				nums[j-1] = temp;
			}
			
			if(j < nums.length-1 && nums[j] < nums[j+1])
			{
				int temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			}
		}
	
		System.out.println("The Rearranged array is : ");
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Question9 ob = new Question9();
		int nums[] = {1, 2, 4, 9, 5,3, 8, 7, 10, 12, 14 };
		ob.rearrangeArray(nums);
		
	}
}
