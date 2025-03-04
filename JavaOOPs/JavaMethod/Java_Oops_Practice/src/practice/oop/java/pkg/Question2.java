package practice.oop.java.pkg;

class Student
{
	private String name;
	
	private int marks;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getMarks()
	{
		return marks;
	}
	
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	
}

public class Question2 
{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Rahul");
		s1.setMarks(75);
		System.out.println("Student Details are :");
		System.out.println("Student name :"+s1.getName());
		System.out.println("Student marks :"+s1.getMarks());
	}
}
