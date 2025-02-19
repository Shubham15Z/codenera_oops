package ar.queset6.pkg;

public class Question6 {
	int findRepeated(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;	
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					return a[i];
				}	
			}	
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int a[] = {1, 3, 2, 3, 4};
		Question6 ob = new Question6();
		int result = ob.findRepeated(a);
		System.out.println("The only repetative element in array is : "+result);
	}
}
