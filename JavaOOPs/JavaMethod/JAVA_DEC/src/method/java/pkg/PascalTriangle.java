package method.java.pkg;

public class PascalTriangle {
	public static void main(String args[])
	{
		PascalTriangle ob = new PascalTriangle();
		ob.pascalTrianglePattern();
		
	}
	
	void pascalTrianglePattern()
	{
		int row = 5;
		for(int i = 0; i < row; i++)
		{
			int number = 1;
			for(int j = 0; j < row-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i; j++)
			{
				System.out.print(number+" ");
				number = number * (i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
