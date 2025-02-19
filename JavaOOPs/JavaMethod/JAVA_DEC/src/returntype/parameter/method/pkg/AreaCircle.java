package returntype.parameter.method.pkg;

public class AreaCircle {
	
	double areaCircle(int r)
	{
		return 3.14*r*r;
	}
	public static void main(String args[])
	{
		AreaCircle ob = new AreaCircle();
		double areaC = ob.areaCircle(4);
		System.out.println("The area of circle is : "+areaC);
	}
}
