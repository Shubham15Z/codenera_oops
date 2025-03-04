package practice.oop.java.pkg;

class Car
{
	private String brand;
	
	private double price;
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class Question1 
{
	public static void main(String[] args) {
		Car ob = new Car();
		ob.setBrand("Tata");
		ob.setPrice(14.5);
		System.out.println("Car details are :");
		System.out.println("Brand = "+ob.getBrand());
		System.out.println("Price = "+ob.getPrice());
	}
	
}
