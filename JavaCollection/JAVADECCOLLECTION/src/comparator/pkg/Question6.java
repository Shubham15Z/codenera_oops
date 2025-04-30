/*
6. Chaining Comparators:
Create a class representing a Car with attributes like make, model, and year. 
Implement multiple comparators, one for each attribute, and then use them to 
sort a list of Cars based on make, model, and year in that order.
 */


package comparator.pkg;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Car
{
	private String make;
	private String model;
	private int year;
	
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "\nmake=" + make + ", model=" + model + ", year=" + year;
	}
}

class SortMake implements Comparator<Car>
{
	public int compare(Car c1, Car c2)
	{
		return c1.getMake().compareTo(c2.getMake());
	}
}

class SortModel implements Comparator<Car>
{
	public int compare(Car c1, Car c2)
	{
		return c1.getModel().compareTo(c2.getModel());
	}
}

class SortYear implements Comparator<Car>
{
	public int compare(Car c1, Car c2)
	{
		if(c1.getYear() > c2.getYear())
			return 1;
		else if(c1.getYear() < c2.getYear())
			return -1;
		else
			return 0;
	}
}

public class Question6 
{
	public static void main(String[] args) 
	{
		LinkedList<Car> car = new LinkedList<Car>();
		car.add(new Car("Toyota",	"Camry",	2020));
		car.add(new Car("Honda",	"Civic",	2019));
		car.add(new Car("Ford",		"Mustang",	2022));
		car.add(new Car("Tesla",	"Model 3",	2018));
		
		System.out.println(car);
		
		System.out.println("\n Sorting based on Make");
		Collections.sort(car, new SortMake());
		System.out.println(car);
		
		System.out.println("\n Sorting based on Model");
		Collections.sort(car, new SortModel());
		System.out.println(car);
		
		System.out.println("\n Sorting based on Year");
		Collections.sort(car, new SortYear());
		System.out.println(car);
		
	}
}

