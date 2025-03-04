package practice.oop.java.pkg;


class Employee
{
	private int id;
	
	private double salary;
	
//	private Employee(int a)
//	{
//		
//	}
//	
//	protected Employee(String b) 
//	{
//		
//	}
	
	public Employee() {
		this.id = 10501;
		this.salary = 50000.0;
	}
	
	public void printDetails()
	{
		System.out.println("Employee details are :\nemp Id = "+this.id+", emp salary = "+this.salary);
	}
}
public class Question10 
{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.printDetails();
	}
}
