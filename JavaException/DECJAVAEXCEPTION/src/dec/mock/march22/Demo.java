/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

package dec.mock.march22;

public class Demo 
{
	void printPattern()
	{
		for(int i = 1; i < 9; i=i+2)
		{
			for(int j = 9; j >= i; j=j-2)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 9; i >= 1; i=i-2)
		{
			for(int j = 9; j >= i; j=j-2)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.printPattern();
	}
}
