/*
Create a class Employee with private variables id and salary. 
Use setter methods to assign values and getter methods to retrieve them.
 */

package dec.encapsulation.pkg;

class Employee
{
	private int id;
	private double salary;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setSalary(double sal)
	{
		this.salary = sal;
	}
	
	public int getId()
	{
		return id;
	}
	
	public double getSalary()
	{
		return salary;
	}
}

public class Question4 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setId(5001);
		e1.setSalary(70000);
		
		System.out.println("Employee details are : Emp Id = "+e1.getId()+" Emp Sal = "+e1.getSalary());
	}
	
}
