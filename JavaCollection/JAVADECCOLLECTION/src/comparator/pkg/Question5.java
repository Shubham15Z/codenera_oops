/*
5. Reverse Order Using Comparable:
Extend the Employee class from the previous question to use the Comparable interface to sort employees by name in reverse alphabetical order.
 */

package comparator.pkg;

import java.util.ArrayList;
import java.util.Collections;

public class Question5 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Rahul",85000, "Support"));
		emp.add(new Employee("Rohit", 58000, "Admin"));
		emp.add(new Employee("Pratiksha", 65000, "DevOps"));
		emp.add(new Employee("Ajay", 61000, "HR"));
		
		System.out.println(emp);
		
		System.out.println("\nSorting Employee list using comparable in reverse by Names ");
		Collections.sort(emp);
		System.out.println(emp);
	}
}
