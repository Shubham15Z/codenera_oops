/*
16. Filter Employees by Salary  
    - Question: Given a list of employees, filter employees with a salary greater than 50,000.
    - Input: [Employee("Alice", 50000), Employee("Bob", 60000), Employee("Eve", 40000)]
    - Output: [Employee("Bob", 60000)]
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [" + name + ", " + salary + "]";
	}
	
	
}

public class Question16 
{
	public static void main(String[] args) 
	{
		List<Employee> e1 = new ArrayList<Employee>();
		e1.add(new Employee("Alice", 50000));
		e1.add(new Employee("Bob", 60000));
		e1.add(new Employee("Eve", 40000));
		
		System.out.println(e1);
		
		List<Employee> e2 = e1.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());
		
		System.out.println(e2);
		
	}
}
