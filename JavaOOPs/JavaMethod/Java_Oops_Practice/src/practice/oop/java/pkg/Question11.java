package practice.oop.java.pkg;

class Person11
{
	private String name;
	
	private int age;
	
	public Person11(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void showPersonDetails()
	{
		System.out.println("Employee details are : name = "+this.name+" age = "+this.age);
	}
	
	
}

class Employee11 extends Person11
{
	private double salary;
	
	Employee11(String name, int age, double salary)
	{
		super(name,age);
		this.salary = salary;
	}
	
	public void showEmployeeDetails()
	{
		super.showPersonDetails();
		System.out.println("Salary :"+this.salary);
	}
}
public class Question11 
{
	public static void main(String[] args) {
		Employee11 e1 = new Employee11("Ajay", 25, 56000.0);
		e1.showEmployeeDetails();
	}
}
