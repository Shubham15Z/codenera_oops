package ar.queset8.pkg;

public class Question12 
{
	int findMajorityElement(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			int count = 1;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j] = -1;
					count++;
				}
			}
			if(count > arr.length/2)
			{
				if(arr[i] != -1)
				{
					return arr[i];
				}
			}		
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		Question12 ob = new Question12();
		int result = ob.findMajorityElement(arr);
		System.out.println("The majority element is : "+result);
	}
}
