package ar.queset6.pkg;

public class Question1 
{
	int firstRepeatedElement(int a[], int k)
	{
		for(int i = 0; i < a.length; i++)
		{
			int count = 1;
			int j;
			for(j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
			}
			if(j == a.length)
			{
				if(count >= k)
				{
					return a[i];
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int a[] = {1,7, 4, 3, 4, 8, 7};
		int k = 2;
		Question1 ob = new Question1();
		int result = ob.firstRepeatedElement(a, k);
		System.out.println("The first repeating element is :"+result);
	}
}
