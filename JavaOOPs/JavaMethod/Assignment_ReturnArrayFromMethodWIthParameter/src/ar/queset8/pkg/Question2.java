package ar.queset8.pkg;

public class Question2 
{
	int findKthSmallestElement(int arr[], int k)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}		
		}
		return arr[k-1];
		
	}
	public static void main(String[] args) 
	{
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		Question2 ob = new Question2();
		int result = ob.findKthSmallestElement(arr, k);
		System.out.println("The "+k+" th Smallest element is : "+result);
	}
}
