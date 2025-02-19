package parameter.method.java.pkg;

import java.util.Scanner;

public class AreaPeriCircle 
{
	void areaCircle(int r)
	{
		double areaC = 3.14*r*r;
		System.out.println("The area of circle is : "+areaC);
	}
	
	void circumCircle(int r)
	{
		double circumC = 2*3.14*r;
		System.out.println("the circumference of circle is : "+circumC);
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		int r = sc.nextInt();
		
		AreaPeriCircle ob = new AreaPeriCircle();
		ob.areaCircle(r);
		ob.circumCircle(r);
	}
}
