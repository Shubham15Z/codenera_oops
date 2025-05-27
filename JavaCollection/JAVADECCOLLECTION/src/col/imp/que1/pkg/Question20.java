/*
20. Group Employees by Department  
    - Question: Group employees by their department.
    - Input: [Employee("Alice", "IT"), Employee("Bob", "HR"), Employee("Charlie", "IT")]
    - Output: {IT=[Alice, Charlie], HR=[Bob]}
 */

package col.imp.que1.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee2
{
	private String name;
	private String department;
	public Employee2(String name, String department) {
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
		return "Employee2 [" + name + ", " + department + "]";
	}
	
	
}

public class Question20
{
	public static void main(String[] args) 
	{
		List<Employee2> list1 = new ArrayList<Employee2>();
		list1.add(new Employee2("Alice", "IT"));
		list1.add(new Employee2("Bob", "HR"));
		list1.add(new Employee2("Charlie", "IT"));
		
		System.out.println(list1);
		
		Map<String, List<String>> grpEmpDept = list1.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDepartment(), 
						Collectors.mapping(emp -> emp.getName(), Collectors.toList())));
		
		System.out.println(grpEmpDept);
	}
}
