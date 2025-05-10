/*
WAP to store 10 different student details (name, roll no, city, state, country, stream, semester) 
create one encapsulated class and store 10 objects with ArrayList now next iterate through iterator interface and forEach loop.
 */

package arraylist.practice2.pkg;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
	private String name;
	private int rollNo;
	private String city;
	private String state;
	private String country;
	private String stream;
	private String semester;
	
	public Student(String name, int rollNo, String city,String state, String stream, String semester) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;
		this.state = state;
		this.country = "India";
		this.stream = stream;
		this.semester = semester;
	}

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "\nname=" + name + ", rollNo=" + rollNo + ", city=" + city + ", state=" + state + ", country="
				+ country + ", stream=" + stream + ", semester=" + semester;
	}
	
}

public class Question11 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> std = new ArrayList<Student>();
		
		std.add(new Student("Rahul", 501, "Pune", "Maharashtra","Mechanical","second"));
		std.add(new Student("Ajay", 504, "Mumbai", "Maharashtra","Computer","third"));
		std.add(new Student("Vishal", 511, "Pune", "Maharashtra","Civil","first"));
		std.add(new Student("Ram", 521, "Nashik", "Maharashtra","Mechanical","sixth"));
		std.add(new Student("Pooja", 531, "Beed", "Maharashtra","Electrical","seven"));
		std.add(new Student("Kirti", 551, "Dhule", "Maharashtra","IT","third"));
		std.add(new Student("Nilesh", 561, "Jalna", "Maharashtra","Production","fourth"));
		std.add(new Student("Akshay", 581, "Nanded", "Maharashtra","Civil","fifth"));
		std.add(new Student("Rohit", 509, "Satara", "Maharashtra","Chemical","eigth"));
		std.add(new Student("Sejal", 504, "Thane", "Maharashtra","Metallurgy","second"));
		
		Iterator<Student> itr = std.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		for(Student student : std)
		{
			System.out.println(student);
		}
	}
}
