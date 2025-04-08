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

package dec.java.runnable.pkg;
class Employee
{
	String name;
	String department;
	
	Employee(String name, String department)
	{
		this.name = name;
		this.department = department;
	}
	
	
}

class MyThread03 implements Runnable
{
	public void findEmployee()
	{
		Employee[] e = {
				new Employee("Alice", "HR"),
				new Employee("Bob", "IT"),
				new Employee("Charlie", "HR"),
				new Employee("David", "Finance")
		};
		
		for(int i = 0; i < e.length; i++)
		{
			if(e[i].department.equals("HR"))
			{
				System.out.print(e[i].name+", ");
			}
		}
	}
	@Override
	public void run()
	{
		findEmployee();
	}
	
}
public class Question3
{
	public static void main(String[] args) 
	{
		MyThread03 mt03 = new MyThread03();
		
		Thread t03 = new Thread(mt03);
		
		t03.start();
	}
}
