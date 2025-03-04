package practice.oop.java.pkg;

interface Vehicle
{
	 String start();
}

class Bike implements Vehicle
{
	public String start()
	{
		return "Bike Starts..";
	}
}

class Car4 implements Vehicle
{
	public String start()
	{
		return "Car Starts...";
	}
}

public class Question4 
{
	public static void main(String[] args) {
		Bike b1 = new Bike();
		System.out.println(b1.start());
		
		Car4 c1 = new Car4();
		System.out.println(c1.start());
	}
}
