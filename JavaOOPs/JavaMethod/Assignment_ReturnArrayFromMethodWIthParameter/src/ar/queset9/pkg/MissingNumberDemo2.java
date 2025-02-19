package ar.queset9.pkg;

public class MissingNumberDemo2 {
	public static void main(String[] args) 
	{
		int a[] = {1,4,9,3,6,8,2,5};
		int n = a.length+1;
		int totalSum = n*(n+1)/2;
		
		System.out.println("Total Sum : "+totalSum);
		
		int arraySum = 0;
		for(int i = 0; i < a.length; i++)
		{
			arraySum = arraySum + a[i];
		}
		
		System.out.println("Array sum is : "+arraySum);
		
		int missingNumber = totalSum - arraySum;
		
		System.out.println("The missing number is : "+missingNumber);
	}
}
