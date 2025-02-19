package parameter.method.java.pkg;

public class PrintArray 
{
	void printArray(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50};
		PrintArray ob = new PrintArray();
		ob.printArray(a);
	}
}
