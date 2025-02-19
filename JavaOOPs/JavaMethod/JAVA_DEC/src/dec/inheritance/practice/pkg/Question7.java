/*
Wap to perform overriding in which 

 Parent class calculate the perimeter of the Triangle  

Child 1 calculate the perimeter of Square
Child 2 Calculate the perimeter of Circle
 */

package dec.inheritance.practice.pkg;

class Triangleperi
{
	void perimeter(int a,int b,int c)
	{
		double perimeter = a+b+c;
		System.out.println("perimeter of triganle is :"+perimeter);
	}
}

class Squareperi extends Triangleperi
{
	void perimeter(int side)
	{
		double perimeter = 4*side;
		System.out.println("perimeter of Square is :"+perimeter);
	}
}

class Circleperi extends Squareperi
{
	void perimeter2(double radius)
	{
		double perimeter = 2*3.14*radius;
		System.out.println("perimeter of Circle is :"+perimeter);
	}
}

public class Question7 {
	public static void main(String[] args) {
		
		Circleperi obj = new Circleperi();
		obj.perimeter(10, 20, 30);
		obj.perimeter(25);
		obj.perimeter2(12);
		
	}

}