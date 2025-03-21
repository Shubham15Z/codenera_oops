/*
 2. Write a Java program to find the student with the highest marks from an array of Student objects.
 */

package dec.java.oop.practice1.pkg;


class Student2
{
	private String name;
	private int rollNo;
	private double marks;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Student2()
	{

	}
	
	public Student2(String name, int rollNo, double marks) 
	{
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	Student2 findHighestMarkStudent(Student2[] students)
	{
		Student2 topper = students[0];
		for(int  i = 0; i < students.length; i++)
        {
			if(students[i].getMarks() > topper.getMarks())
			{
				topper = students[i];
			}
        }
		
		return topper;
	}
	
	void display(Student2 topper)
	{
		System.out.println("Student with highest mark is : ");
		System.out.println("name = "+topper.getName()+", Roll No = "+topper.getRollNo()+" , Marks : "+topper.getMarks());
	}

}
public class Question2 
{
	public static void main(String[] args) {
		Student2[] students = new Student2[5];
        students[0] = new Student2("Ajay", 5001, 84);
        students[1] = new Student2("Vishal", 5002, 76);
        students[2] = new Student2("Ram", 5010, 92);
        students[3] = new Student2("Vijay", 5015, 65);
        students[4] = new Student2("Rohit", 5018, 72);
        
        Student2 st2 = new Student2();
		Student2 topper = st2.findHighestMarkStudent(students);
		st2.display(topper);
        
        
	}
}
