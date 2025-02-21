/*
Implement a Student class where the name and rollNumber are private. 
Provide public methods to update and fetch their values.
 */

package dec.encapsulation.pkg;

class Student
{
	private String name;
	private int rollNumber;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setRollNum(int rollNum)
	{
		this.rollNumber = rollNum;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRollNum()
	{
		return rollNumber;
	}
}

public class Question5 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setName("Ajay");
		s1.setRollNum(801);
		
		System.out.println("Student Details are : "+s1.getName()+" "+s1.getRollNum());
	}
}
