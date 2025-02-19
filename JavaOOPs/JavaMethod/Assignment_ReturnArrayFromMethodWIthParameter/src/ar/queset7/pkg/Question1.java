package ar.queset7.pkg;

public class Question1 
{
	int maxProduct(int a[])
	{
		int max = 0, secMax = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max)
			{
				secMax = max;
				max = a[i];
			}
			else if(a[i] > secMax && secMax != max)
			{
				secMax = a[i];
			}
		}
		return max*secMax;
	}
	public static void main(String[] args)
	{
		int a[] = {4,8,3,9,2};
		Question1 ob = new Question1();
		int result = ob.maxProduct(a);
		
		System.out.println("The maximum product of two integers is : "+result);
	}
}
