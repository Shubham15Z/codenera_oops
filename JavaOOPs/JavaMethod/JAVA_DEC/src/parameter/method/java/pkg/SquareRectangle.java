package parameter.method.java.pkg;

public class SquareRectangle {
	void areaSquare(int s)
	{
		System.out.println("The area of square is : "+(s*s));
	}
	
	void areaRectangle(int l, int b)
	{
		System.out.println("The area of rectangle is : "+(l*b));
	}
	
	void periSquare(int s)
	{
		System.out.println("The perimeter of square is : "+(4*s));
	}
	
	void periRectangel(int l, int b)
	{
		System.out.println("The perimeter of rectangle is : "+(2*(l+b)));
	}
	public static void main(String arg[])
	{
		SquareRectangle ob = new SquareRectangle();
		ob.areaSquare(5);
		ob.areaRectangle(5, 6);
		ob.periSquare(5);
		ob.periRectangel(5, 6);
	}
}
