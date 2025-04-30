package comparable.pkg;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	private int rollNo;
	private String name;
	private int age;
	
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nrollNo=" + rollNo + ", name=" + name + ", age=" + age;
	}

//	@Override
//	public int compareTo(Student o) {
//		if(age == o.getAge())
//			return 0;
//		else if(age > o.getAge())
//			return 1;
//		else
//			return -1;
//	}
	
	
	public int compareTo(Student o)
	{
		return this.name.compareTo(o.getName());
	}
	
	
	
	
}
public class StudentDemo
{
	public static void main(String[] args)
	{
		ArrayList<Student> student = new ArrayList<Student>();
		
		Student s1 = new Student(1, "Ajay", 28);
		Student s2 = new Student(2, "Rahul", 26);
		Student s3 = new Student(3, "Vishal", 30);
		
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(new Student(4,"Sham",24));
		student.add(new Student(5, "Ram", 25));
		
		System.out.println("Before Sort : ");
		System.out.println(student);
		System.out.println("----------------------");
		
//		System.out.println("Sorting based on Age :");
//		Collections.sort(student);
//		System.out.println(student);
//		System.out.println("-----------------------");
		
		System.out.println("Sorting based on Name :");
		Collections.sort(student);
//		Collections.sort(student, Collections.reverseOrder());
		System.out.println(student);
		System.out.println("-----------------------");
	}
}
