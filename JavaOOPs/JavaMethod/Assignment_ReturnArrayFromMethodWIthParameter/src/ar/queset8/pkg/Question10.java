package ar.queset8.pkg;

public class Question10 
{
	int findMinimuDiffOfTower(int arr[], int k)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < k)
			{
				arr[i] = arr[i]+k;
			}
			else
			{
				arr[i] = arr[i]-k;
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

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
		return arr[arr.length-1]-arr[0];
	}
	
	public static void main(String[] args)
	{
		int arr[] = {1, 15, 10};
		int k = 6;
		
		Question10 ob = new Question10();
		int result = ob.findMinimuDiffOfTower(arr, k);
		System.out.print("\nThe minimum height between longest and shortest tower is : "+result);
	}
}
