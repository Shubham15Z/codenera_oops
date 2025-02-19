package ar.queset6.pkg;

public class Question7 {
	
	void findUnion(int a[], int b[])
	{
		for(int i = 0; i< a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i = 0; i < b.length; i++)
		{	
			int count = 0;
			for(int j = 0; j < a.length; j++)
			{
				if(b[i] == a[j])
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				System.out.print(b[i]+" ");
			}
		}
	}
	
	void findIntersection(int a[], int b[])
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b.length; j++)
			{
				if(a[i] == b[j])
				{
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
	}
		
	public static void main(String args[])
	{
		Question7 ob = new Question7();
		int a[] = {1, 3, 4, 5, 7};
		int b[] = {2, 3, 5, 6};
		
		System.out.println("The Union elements are : ");
		ob.findUnion(a, b);
		System.out.println();
		System.out.println("The intersection elements are : ");
		ob.findIntersection(a, b);
		
	}

}
