package comparator.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparator<Student>
{
	private int rollNo;
	private String name;
	private int age;
	
	public Student() {
	}
	
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "\nrollNo=" + rollNo + ", name=" + name + ", age=" + age;
	}
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getName().compareTo(o2.getName()) > 0)
			return 1;
		else if(o1.getName().compareTo(o2.getName()) < 0)
			return -1;
		else
			return 0;
	}
}

class AgeSort implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge() == o2.getAge())
			return 0;
		else if(o1.getAge() > o2.getAge())
			return 1;
		else
			return -1;
	}
	
}
public class ComparatoDemo implements Comparator<Student>
{
	public static void main(String[] args) 
	{
		ArrayList<Student> std = new ArrayList<Student>();
		std.add(new Student(102,"Rahul",15));
		std.add(new Student(108,"Vishal",16));
		std.add(new Student(105,"Sham",18));
		std.add(new Student(108,"Pooja",14));
		std.add(new Student(103,"Kirti",17));
		std.add(new Student(107,"Raj",13));
		std.add(new Student(109,"Megha",16));
		
		System.out.println(std);
		System.out.println("----------------------------");
		
		System.out.println("\nSorting based on Age");
		Collections.sort(std, new AgeSort());
		System.out.println(std);
		
		System.out.println("----------------------------");
		System.out.println("Sorting based on Name");
		Collections.sort(std, new Student());
		System.out.println(std);
		
		System.out.println("----------------------------");
		System.out.println("Sorting based on RollNo");
		Collections.sort(std, new ComparatoDemo());
		System.out.println(std);
		
		
	}

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getRollNo() > o2.getRollNo())
			return 1;
		else if(o1.getRollNo() < o2.getRollNo())
			return -1;
		else
			return 0;
	}
	
	
}
