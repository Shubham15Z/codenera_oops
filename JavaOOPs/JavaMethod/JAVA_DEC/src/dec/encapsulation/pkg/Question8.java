/*
Modify the Car class such that the price cannot be negative. 
Validate this in the setter method.
 */


package dec.encapsulation.pkg;

class Car1 
{
	private double price;
	
	public void setPrice(int price)
	{
		if(price < 0)
			System.out.println("Please Enter a valid price");
		else
			this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
}

public class Question8 
{
	public static void main(String[] args) 
	{
		Car1 c1 = new Car1();
		c1.setPrice(-20);
		System.out.println("The car Price is : "+c1.getPrice()+" Lakhs");
		System.out.println("------------------------------");
		c1.setPrice(30);
		System.out.println("The car Price is : "+c1.getPrice()+" Lakhs");
	}
}
