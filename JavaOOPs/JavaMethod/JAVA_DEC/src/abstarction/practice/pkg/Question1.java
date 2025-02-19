/*
 Create an abstract class Shape with an abstract method calculateArea(). Derive two classes Circle and 
 Rectangle that implement this method.
 */

package abstarction.practice.pkg;

abstract class Shape
{
	abstract float calculateArea();
}

class Circle extends Shape
{
	float calculateArea() {
		int r = 5;
		return 2*3.14f*r;	
	}
}

class Rectantangle extends Shape
{
	float calculateArea()
	{
		int l = 10, b = 20;
		return l*b;
	}
}

public class Question1 
{
	public static void main(String[] args)
	{
		Shape ob = new Circle();
		float areaCircle = ob.calculateArea();
		System.out.println("Area of Circle is : "+areaCircle);
		
		Shape ob1 = new Rectantangle();
		float areaRect = ob.calculateArea();
		System.out.println("Area of rectangle is : "+areaRect);
	}
	
}
