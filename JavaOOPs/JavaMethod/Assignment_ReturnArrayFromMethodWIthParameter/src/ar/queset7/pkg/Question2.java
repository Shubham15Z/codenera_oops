package ar.queset7.pkg;

import java.util.Random;

public class Question2 
{
	void shuffleElements()
	{
		int nums[] = { 1, 2, 3, 4, 5, 6 };
		Random rd = new Random();
		
		for(int i = nums.length-1; i > 0; i--)
		{
			int j = rd.nextInt(i+1);
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}

		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int nums[] = { 1, 2, 3, 4, 5, 6 };
		Question2 ob = new Question2();
		ob.shuffleElements();
	}
}
