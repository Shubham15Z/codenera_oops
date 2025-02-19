package method.java.pkg;

public class SortArrayElements {
	public static void main(String args[])
	{
		SortArrayElements ob = new SortArrayElements();
		ob.ascendingSort();
		System.out.println();
		ob.descendingsort();
	}
	
	
	void ascendingSort()
	{
		int a [] = {89, 49,3,92,67,25};
		System.out.println("The array elements are : ");
		for(int k = 0; k < a.length; k++)
		{
			System.out.print(a[k]+" "); 
		}
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
		System.out.println();
		System.out.println("The Ascending sorted elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	void descendingsort()
	{
		int a [] = {89, 49,3,92,67,25};
		System.out.println("The array elements are : ");
		for(int k = 0; k < a.length; k++)
		{
			System.out.print(a[k]+" ");
		}
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] < a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("The Descending sorted elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
