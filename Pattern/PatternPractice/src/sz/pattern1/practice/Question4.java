/*
 *****
  ***
   *
 */

package sz.pattern1.practice;

public class Question4 
{
	public static void main(String[] args) 
	{
//		int n = 5;
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 5; j >= 2*i-1; j--)
			{
				System.out.print("*");
				
			}
//			n--;
			System.out.println();
		}
	}
}
