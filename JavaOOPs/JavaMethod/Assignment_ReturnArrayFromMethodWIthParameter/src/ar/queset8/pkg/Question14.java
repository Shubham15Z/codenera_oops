package ar.queset8.pkg;

public class Question14 
{
	int maxProduct(int arr[])
	{
		int maxProd = 1;
		int num1 = 0, num2 = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				int prod = arr[i]*arr[j];
				if(prod> maxProd)
				{
					maxProd = prod;
					num1 = arr[i];
					num2 = arr[j];
				} 
			}	
		}
		return maxProd;
	}
	public static void main(String[] args) 
	{
		int arr[] = { 2, 3, 5, 7, -7, 5, 8, -5 };
		Question14 ob = new Question14();
		int result = ob.maxProduct(arr);
		System.out.println("Maximum product : "+result);
	}
}
