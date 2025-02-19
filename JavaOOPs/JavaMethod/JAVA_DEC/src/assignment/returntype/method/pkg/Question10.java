/*
10. Write a method to calculate the simple interest given principal, rate, and time.
 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question10 {
	double simpleInterest(double principal, double rate, double time)
	{
		return (principal*rate*time)/100;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Question10 ob = new Question10();
		
		System.out.println("Enter principal amount : ");
		double p = sc.nextDouble();
		System.out.println("Enter rate :");
		double r = sc.nextDouble();
		System.out.println("Enter number of years : ");
		double y = sc.nextDouble();
		
		double si = ob.simpleInterest(p, r, y);
		System.out.println("The simple interest is : "+si);
	}
}
