package ar.queset6.pkg;

public class Question9 
{
	int findUnique(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;	
			for(int j = 0; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}	
			}
			if(count == 1)
			{	
				return a[i];
			}	
		}
		return -1;
	}
	public static void main(String args[])
	{
		Question9 ob = new Question9();
		int a[] = {2, 3, 5, 4, 5, 3, 4};
		int result = ob.findUnique(a);
		System.out.println("The element which occurs once is = "+result);
	}
}
