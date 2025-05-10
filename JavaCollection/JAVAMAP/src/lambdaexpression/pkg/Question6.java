/*
6. Find Maximum of Two Numbers: Create a lambda expression that takes two integers and returns the maximum of the two.
 */

package lambdaexpression.pkg;

interface Maximum
{
	public int findMaximum(int a, int b);
}
public class Question6 
{
	public static void main(String[] args)
	{
		Maximum m1 = (int a1, int b1) -> {
			if(a1 > b1)
				return a1;
			else
				return b1;
		};
		
		int max = m1.findMaximum(50, 60);
		System.out.println("Maximum of two is : "+max);
	}
}
