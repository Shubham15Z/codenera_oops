/*
7. Calculate area of triangle, rectangle, square
 */
package assignment.returntype.method.pkg;

import java.util.Scanner;
public class Question7 {
	
	double areaTriangle(int base, int height)
	{
		return (base * height)/2;
	}
	
	int areaRectangle(int length, int breadth)
	{
		return length*breadth;
	}
	
	float areaSquare(float side)
	{
		return side*side;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Question7 ob = new Question7();
		
		System.out.println("Enter the base of triangle : ");
		int base = sc.nextInt();
		System.out.println("Enter the height of triangle : ");
		int height = sc.nextInt();
		double areaTriangle = ob.areaTriangle(base, height);
		System.out.println("The area of triangle is : "+areaTriangle);
		
		System.out.println("Enter the length of rectangle : ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle : ");
		int breadth = sc.nextInt();
		int areaRect = ob.areaRectangle(length, breadth);
		System.out.println("The area of Rectangle is : "+areaRect);
		
		System.out.println("Enter the side of square : ");
		float s1 = sc.nextFloat();
		float areaSquare = ob.areaSquare(s1);
		System.out.println("The area of square is : "+areaSquare);
		
		
	}
}
