/*

10. Square of a Number: Write a lambda expression that takes an integer and returns its square.
 */

package lambdaexpression.pkg;

interface SquareNum
{
	public double findSquare(int n1);
}

public class Question10 
{
	public static void main(String[] args)
	{
		int num = 8;
		
		SquareNum s1 = (int n1) -> {
			return n1*n1;
		};
		
		double res = s1.findSquare(num);
		System.out.println("Square is : "+res);
	}
}
