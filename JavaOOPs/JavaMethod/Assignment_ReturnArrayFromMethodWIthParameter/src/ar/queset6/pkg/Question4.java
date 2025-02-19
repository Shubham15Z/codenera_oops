package ar.queset6.pkg;

public class Question4 {
	int minimumProduct(int a[], int b[])
	{
		int minProd = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++)
		{
			minProd = minProd + (a[i]*b[i]);
		}
		
		return minProd;
	}
	
	public static void main(String args[])
	{
		Question4 ob = new Question4();
		int A[] = {3, 1, 1};
		int B[] = {6, 5, 4};
		int result = ob.minimumProduct(A, B);
		System.out.println("The minimum value is : "+result);
	}
}
