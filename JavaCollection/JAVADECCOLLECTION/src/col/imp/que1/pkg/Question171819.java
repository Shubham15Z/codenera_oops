/*
17. Sort Employees by Name  
    - Question: Sort employees by their names in alphabetical order.
    - Input: [Employee("Charlie", 55000), Employee("Alice", 70000), Employee("Bob", 65000)]
    - Output: [Employee("Alice", 70000), Employee("Bob", 65000), Employee("Charlie", 55000)]


18. Find Employee with Max Salary  
    - Question: Find the employee with the highest salary.
    - Input: [Employee("Alice", 70000), Employee("Bob", 65000), Employee("Charlie", 80000)]
    - Output: Employee("Charlie", 80000)

19. Average Salary  
    - Question: Calculate the average salary of all employees.
    - Input: [Employee("Alice", 70000), Employee("Bob", 65000), Employee("Charlie", 80000)]
    - Output: 71666.67
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee1
{
	private String name;
	private int salary;
	public Employee1(String name, int salary) {
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
		return "Employee1 [" + name + ", " + salary + "]";
	}
	
	
}
public class Question171819 
{
	public static void main(String[] args) 
	{
		List<Employee1> e1 = new ArrayList<Employee1>();
		e1.add(new Employee1("Charlie", 80000));
		e1.add(new Employee1("Alice", 70000));
		e1.add(new Employee1("Bob", 65000));
		
		
		System.out.println(e1);
		
		List<Employee1> e2 = e1.stream().sorted((emp1,emp2) -> emp1.getName().compareTo(emp2.getName())).collect(Collectors.toList());
		
		System.out.println(e2);
		
		Employee1 empMaxSal = e1.stream().max((emp1,emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary())).orElse(null);
//		Employee1 empMaxSal = e1.stream().max(Comparator.comparingInt(Employee1::getSalary)).orElse(null);
		
		System.out.println(empMaxSal);
		
		double avgSal = e1.stream().collect(Collectors.averagingInt(e -> e.getSalary()));
//		double avgSal = e1.stream().mapToInt(emp -> emp.getSalary()).average().orElse(0.0);
		
		System.out.println(avgSal);
	}
	
	
}
