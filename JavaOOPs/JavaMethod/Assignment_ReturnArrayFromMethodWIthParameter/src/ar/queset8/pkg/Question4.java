package ar.queset8.pkg;

import java.util.Arrays;

public class Question4 
{
	int [] sortArrayint (int arr[])
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
		return arr;
	}
	public static void main(String[] args) 
	{
		int arr[] = {1, 0, 1, 2, 0, 0, 2, 2, 1, 2, 0, 1};
		Question4 ob = new Question4();
		int arr1[] = ob.sortArrayint(arr);
		System.out.println(Arrays.toString(arr1));
	}
}
