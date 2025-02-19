package ar.queset8.pkg;

public class Question3 {
	int findCount(int arr[], int x)
	{
		int  count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == x)
			{
				count++;
			}	
		}
		return count;
	}
	public static void main(String[] args)
	{
		int arr[] = {1, 1, 2, 2, 2, 2, 3,};
		int x = 2;
		
		Question3 ob = new Question3();
		int count = ob.findCount(arr, x);
		System.out.println("The occurence of "+x+" in array is : "+count+" times");
	}
}
