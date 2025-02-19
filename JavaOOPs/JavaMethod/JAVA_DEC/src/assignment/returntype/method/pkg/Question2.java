/*
2.Wap to input a number and check it is Armstrong or not
 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question2 {
	String checkArmstrong(int n)
	{
		int i = n;
		int sum = 0, rem;
		
		while(i > 0)
		{
			rem = i % 10;
			sum = sum + rem*rem*rem;
			i = i/10;
		}
		
		if(sum == n)
		{
			return "Number is Armstrong";
		}
		else
		{
			return "Number is not Armstrong";
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		Question2 ob = new Question2();
		String result = ob.checkArmstrong(n);
		System.out.println(result);
	}
}
