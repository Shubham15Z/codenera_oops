/*

8. Calculate Factorial: Write a lambda expression that takes an integer and returns its factorial.
 */

package lambdaexpression.pkg;

interface Factorial
{
	public long findFactorial(int n1);
}
public class Question8 
{
	public static void main(String[] args) 
	{
		int n = 6;
		Factorial f1 = (int num) -> {
			long fact = 1;
			int i = num;
			while(i > 1)
			{
				fact = fact*i;
				i=i-1;
			}
			return fact;
		};
		
		long res = f1.findFactorial(n);
		System.out.println("Factorial of "+n+" is : "+res);
	}
}
