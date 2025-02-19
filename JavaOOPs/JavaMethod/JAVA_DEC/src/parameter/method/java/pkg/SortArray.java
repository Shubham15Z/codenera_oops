package parameter.method.java.pkg;

public class SortArray {

	void ascendingSortArray(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				if(a[i] < a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int a [] = {3,5,8,2,6,9};
		SortArray ob = new SortArray();
		ob.ascendingSortArray(a);
	}
}
