/*
4. Sorting Employees:
Create a class for Employee with attributes like name, salary, and department. 
Use the Comparator interface to sort a list of Employee objects by salary in descending order.
 */

package comparator.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee>
{
	private String name;
	private double salary;
	private String department;
	
	public Employee(String name, double salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "\nname=" + name + ", salary=" + salary + ", department=" + department;
	}
	
	public int compareTo(Employee e)
	{
		if(this.name.compareTo(e.getName()) < 0)
			return 1;
		else if(this.name.compareTo(e.getName()) > 0)
			return -1;
		else
			return 0;
	}
}

class SortSalary implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		if(e1.getSalary() < e2.getSalary())
			return 1;
		else if(e1.getSalary() > e2.getSalary())
			return -1;
		else
			return 0;
	}
}
public class Question4 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Rahul",85000, "Support"));
		emp.add(new Employee("Rohit", 58000, "Admin"));
		emp.add(new Employee("Pratiksha", 65000, "DevOps"));
		emp.add(new Employee("Ajay", 61000, "HR"));
		
		System.out.println(emp);
		
		System.out.println("Sorting Employee lis in Descending by Salary ");
		Collections.sort(emp, new SortSalary());
		System.out.println(emp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
