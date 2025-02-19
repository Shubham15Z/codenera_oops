package ar.queset5.pkg;

public class Question1 {
	int findKthSmallerElement(int a[], int k)
	{
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
		return a[k-1];
	}
	
	public static void main(String args[])
	{
		Question1 ob = new Question1();
		int a[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		int result = ob.findKthSmallerElement(a, k);
		System.out.println(result);
	}
}
