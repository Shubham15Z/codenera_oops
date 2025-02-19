package ar.queset6.pkg;

public class Question5 {
	int findKthElement(int arr1[], int arr2[], int k)
	{
		int arr3[] = new int [arr1.length + arr2.length];
		for(int i = 0; i < arr1.length; i++)
		{
			arr3[i] = arr1[i];
		}
		for(int j = 0; j < arr2.length; j++)
		{	
			arr3[arr1.length+j] = arr2[j];	
		}
		for(int i = 0; i < arr3.length; i++)
		{	
			for(int j = i+1; j < arr3.length; j++)
			{
				if(arr3[i] > arr3[j])
				{
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}	
			}	
		}
		return arr3[k-1];
	}
	
	public static void main(String args[])
	{
		Question5 ob = new Question5();
		int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		int k = 5;
		int result = ob.findKthElement(arr1, arr2, k);
		System.out.println("The element is :"+result);
	}
}
