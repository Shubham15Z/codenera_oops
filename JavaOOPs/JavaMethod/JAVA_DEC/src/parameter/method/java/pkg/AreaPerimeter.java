package parameter.method.java.pkg;

import java.util.Scanner;

public class AreaPerimeter 
{
	void areatriangle(int base, int height)
	{
		double areaT =  (base * height)/2;
		System.out.println("Area of Triangle is : "+areaT);
	}
	
	void perimeterTriangle(int s1, int s2, int s3)
	{
		int perimeterT = s1+s2+s3;
		System.out.println("The perimeter of triangle is : "+perimeterT);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of triangle : ");
		int base = sc.nextInt();
		System.out.println("Enter the height of triangle : ");
		int height = sc.nextInt();
		
		AreaPerimeter ob = new AreaPerimeter();
		ob.areatriangle(base, height);
		
		System.out.println("Enter the 1st side of triangle : ");
		int s1 = sc.nextInt();
		System.out.println("Enter the 2nd side of triangle : ");
		int s2 = sc.nextInt();
		System.out.println("Enter the 3rd side of triangle : ");
		int s3 = sc.nextInt();
		
		ob.perimeterTriangle(s1, s2, s3);
		
		
		
	}
}
