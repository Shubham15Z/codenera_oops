package practice.oop.java.pkg;



public class Pattern1 
{
	public void print()
	{
		int n = 4;
		for(int i = 1; i <= 3; i++)
		{
			
			for(int j = 1; j <= i; j++)
			{
				if(i == 3 && j == 3)
				{
					continue;
				}	
				System.out.print(j);
			}
			for(int j = i; j <= 2; j++)
			{
				System.out.print(" ");
			}

			for(int j = 1; j <= i; j++)
			{
				if(i == 1 && j == 1)
				{
					System.out.print(" ");
				}
				System.out.print(n+j);
			}
			n--;
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Pattern1 p1 = new Pattern1();
		p1.print();
	}
}
