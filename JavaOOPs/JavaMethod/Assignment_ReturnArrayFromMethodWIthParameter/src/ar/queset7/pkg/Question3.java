package ar.queset7.pkg;

public class Question3
{
	void arrangeElement(int nums[])
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
		int nums[] = {1, 2, 4, 9, 5,3, 8, 7, 10, 12, 14 };
		Question3 ob = new Question3();
		ob.arrangeElement(nums);
	}
}
