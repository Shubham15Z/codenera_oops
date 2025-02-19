package ar.queset4.pkg;

public class Question7 {
	void printPrime(int a[])
	{
		System.out.println("The prime numbers in array are : ");
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;
			for(int j = 1 ; j <= a[i]; j++)
			{
				if(a[i] % j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	
	public static void main(String args[])
	{	
		Question7 ob = new Question7();
		int a [] = {2,7,31,23,9,8,70,47};
		ob.printPrime(a);
	}
}
