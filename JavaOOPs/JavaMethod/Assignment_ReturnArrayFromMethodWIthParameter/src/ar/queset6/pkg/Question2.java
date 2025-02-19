package ar.queset6.pkg;

public class Question2 
{
	void leaderElements(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			int j;
			for(j = i+1; j < a.length; j++)
			{
				if(a[i] < a[j])
				{
					break;
				}
			}
			
			if(j == a.length)
			{
				System.out.print(a[i]+" ");	
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[] = {16,17,4,3,5,2};
		Question2 ob = new Question2();
		System.out.println("The leader elements are :");
		ob.leaderElements(a);
	}
}
