/*
Develop an abstract class Employee with abstract methods calculateSalary() and displayDetails(). 
Create subclasses PermanentEmployee and ContractEmployee to implement these methods.
 */

package abstarction.practice.pkg;

abstract class Employee
{
	abstract double calculateSalary();
	
	abstract void displayDetails();
}

class PermanentEmployee extends Employee
{
	double calculateSalary() 
	{
		double baseSal = 15000;
		double hra = 15;
		return baseSal+(baseSal*hra/100);
		
	}

	void displayDetails() 
	{
		String name = "Ajay";
		int empId = 101;
		System.out.println("Employee Details are : name = "+name+" empId = "+empId);
		
	}
}

public class Question3 
{
	public static void main(String[] args) 
	{
		Employee e = new PermanentEmployee();
		e.calculateSalary();
	}
}
