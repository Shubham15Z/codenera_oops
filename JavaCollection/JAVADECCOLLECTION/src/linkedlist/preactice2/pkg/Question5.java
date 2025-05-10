/*
 5. Given a linked list of employee objects (with attributes like ID, name, and salary), 
 implement a Comparer to sort the linked list based on different criteria like salary or name.
 */

package linkedlist.preactice2.pkg;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Employee
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

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "\nid=" + id + ", name=" + name + ", salary=" + salary;
	}
}

class SortById implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		if(e1.getId() > e2.getId())
			return 1;
		else if(e1.getId() < e2.getId())
			return -1;
		else
			return 0;
	}
}

class SortByName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		if(o1.getName().compareTo(o2.getName()) > 0)
			return 1;
		else if(o1.getName().compareTo(o2.getName()) < 0)
			return -1;
		else
			return 0;
	}
}

class SortBySalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary() > o2.getSalary())
			return 1;
		else if(o1.getSalary() < o2.getSalary())
			return -1;
		else
			return 0;
	}
	
}

public class Question5
{
	public static void main(String[] args)
	{
		LinkedList<Employee> emp = new LinkedList<Employee>();
		emp.add(new Employee(1001,"Sham",45000));
		emp.add(new Employee(1012,"Rahul",55000));
		emp.add(new Employee(1059,"Vijay",85000));
		emp.add(new Employee(1071,"Saurabh",25000));
		emp.add(new Employee(1038,"Ganesh",55000));
		emp.add(new Employee(1023,"Rohit",35000));
		
		System.out.println(emp);
		
		System.out.println("\nSorting of Employee list based on Id using Comparator :");
		Collections.sort(emp, new SortById());
		System.out.println(emp);
		
		System.out.println("\nSorting of Employee list based on name using Comparator :");
		Collections.sort(emp, new SortByName());
		System.out.println(emp);
		
		System.out.println("\nSorting of Employee list based on Salary using Comparator :");
		Collections.sort(emp, new SortBySalary());
		System.out.println(emp);
	}
}
