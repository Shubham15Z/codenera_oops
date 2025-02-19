/*

14. Write a method to calculate the circumference of a circle given its radius.

 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question14 {
	double circumferenceCircle(int r)
	{
		return (2*3.14*r);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Question14 ob = new Question14();
		
		System.out.println("Enter a radius :");
		int r = sc.nextInt();
		
		double res = ob.circumferenceCircle(r);
		System.out.println("The Circumference of circle is :"+res);
	}
}
