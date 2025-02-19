package ar.queset7.pkg;

public class Question6 
{
	void peakElement(int array[])
	{
		for(int i = 1; i < array.length-1; i++)
		{
			if(array[i]>array[i-1] && array[i]>array[i+1])
			{
				System.out.print(array[i]+" ");
			}		
		}
	}
	public static void main(String[] args) 
	{
		int array[]= {10, 20, 15, 2, 23, 90, 67};
		Question6 ob = new Question6();
		System.out.println("The peak elements are : ");
		ob.peakElement(array);
	}
}
