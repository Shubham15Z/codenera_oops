package comparable.pkg;

import java.util.Collections;
import java.util.LinkedList;

class Employee implements Comparable<Employee>
{
	private int id;
	
	private String name;
	
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n"+id + ", name=" + name + ", salary=" + salary ;
	}

	@Override
	public int compareTo(Employee e) {
		return this.name.compareTo(e.getName());
	}
	
}

class EmployeeDemo
{
	public static void main(String[] args) 
	{
		LinkedList<Employee> emp = new LinkedList<Employee>();
		emp.add(new Employee(5001,"Ram Sharma",50000));
		emp.add(new Employee(5002,"Ajay Roy",40000));
		emp.add(new Employee(5003,"Vishal Mane",60000));
		emp.add(new Employee(5004,"Sham Joshi",80000));
		emp.add(new Employee(5005,"Vishal Mote",55000));
		
		System.out.println("Before Sort");
		System.out.println(emp);
		
		Collections.sort(emp, Collections.reverseOrder());
		
		System.out.println("\nAfter reverse sorting based on names :");
		System.out.println(emp);
	}
}
