/*
1.Wap to input a number and check it is prime or not
 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question3 {
	String checkPrime(int n)
	{
		int i = 1;
		int count = 0;
		
		while(i <= n)
		{
			if(n%i == 0)
			{
				count++;
			}
			i++;
		}
		
		if(count == 2)
		{
			return "Number is Prime";
		}
		else
		{
			return "Number is not Prime";
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		Question3 ob = new Question3();
		String result = ob.checkPrime(n);
		System.out.println(result);
	}
}
