package method.java.pkg;

public class MergeArray {
	public static void main(String args[])
	{
		MergeArray ob = new MergeArray();
		ob.mergeArray();
	}
	
	void mergeArray()
	{
		int a [] = {10,30,50};
		int b [] = {100,300,800,200};
		int c [] = new int [a.length+b.length];
		
		System.out.println("The elements in array a are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("The elements in array b are : ");
		for(int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		for(int i = 0; i <a.length; i++)
		{
			c[i] = a[i];
		}
		
		for(int i = 0; i < b.length; i++)
		{
			c[a.length+i] = b[i];
		}
		
		System.out.println();
		System.out.println("The elements after merging in array c are : ");
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
}
