package ar.queset7.pkg;

public class Question5 
{
	int maxDifference(int nums[])
	{
        int minElement = nums[0];
        int maxDiff = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - minElement > maxDiff) {
                maxDiff = nums[i] - minElement;
            }
            if (nums[i] < minElement) {
                minElement = nums[i];
            }
        }
        return maxDiff;
}
	
	public static void main(String[] args)
	{
		int nums[] = {2, 3, 1, 7, 9, 5, 11, 3, 5};
		Question5 ob = new Question5();
		int result = ob.maxDifference(nums);
		System.out.println("The Maximum difference is : "+result);
	}
}
