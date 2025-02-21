/*
Write a Java program to create a Car class with private variables brand and price. 
Use getter and setter methods to access them.
 */

package dec.encapsulation.pkg;


class Car
{
	private String brand;
	private double price;
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public double getPrice()
	{
		return price;
	}
}
public class Question2 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car();
		c1.setBrand("BMW");
		c1.setPrice(50.75);
		System.out.println("Car details are : "+c1.getBrand()+" : "+c1.getPrice()+" lakhs");
	}
}
