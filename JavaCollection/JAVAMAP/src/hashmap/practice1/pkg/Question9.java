/*
9. Find Employees by Department
   Problem Description:  
   Write a Java program that takes a list of employees and their departments and stores them in a HashMap.
    Given a department name, return all employees in that department.

   Input: A list of employees with their department names.  
   Output: A list of employees for a given department.

   Example:
   - Input: {"Alice": "HR", "Bob": "IT", "Charlie": "HR", "David": "Finance"}
   - Output for HR: ["Alice", "Charlie"]
 */

package hashmap.practice1.pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee
{
	private String name;
	private String department;
	
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "\nname=" + name + ", department=" + department;
	}
	
}
public class Question9 
{
	public static void findEmployeeByDepartment(List<Employee> e1, String dept1)
	{
		Map<String, List<String>> m1 = new HashMap<String, List<String>>();
		
		for(Employee emp : e1)
		{
			String dept = emp.getDepartment();
			String name = emp.getName();
			if(!m1.containsKey(dept))
			{
				m1.put(dept, new ArrayList<String>());
			}
			m1.get(dept).add(name);
		}
		
		List<String> result = m1.get(dept1);
		
		System.out.println(result);
		
	}
	public static void main(String[] args) 
	{
		List<Employee> e1 = new ArrayList<Employee>();
		e1.add(new Employee("Alice", "HR"));
		e1.add(new Employee("Bob", "IT"));
		e1.add(new Employee("Charlie", "HR"));
		e1.add(new Employee("David", "Finance"));
		
		String dept = "HR";
		
		findEmployeeByDepartment(e1, dept);

	}
}
