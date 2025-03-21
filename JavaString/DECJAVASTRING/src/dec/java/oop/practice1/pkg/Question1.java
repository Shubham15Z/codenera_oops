/*
 1. Create a class Student with attributes name, roll number, and marks. Create an array of Student objects and 
 print the details of all students.
 */

package dec.java.oop.practice1.pkg;

class Student
{
	private String name;
	private int rollNo;
	private double marks;
	
	public Student()
	{
		Student[] students = new Student[5];
        students[0] = new Student("Ajay", 5001, 84);
        students[1] = new Student("Vishal", 5002, 76);
        students[2] = new Student("Ram", 5010, 92);
        students[3] = new Student("Vijay", 5015, 65);
        students[4] = new Student("Rohit", 5018, 65);
        
        for(int  i = 0; i < students.length; i++)
        {
        	students[i].display();
        }
	}
	
	public Student(String name, int rollNo, double marks) 
	{
		this.name = name;
		this.rollNo = rollNo;
		this.setMarks(marks);
	}
	
	void display()
	{
		System.out.println("name = "+name+", Roll No = "+rollNo+" , Marks : "+getMarks());
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}
public class Question1 
{
	public static void main(String[] args) 
	{
		Student std = new Student();
		
		
	}
}
