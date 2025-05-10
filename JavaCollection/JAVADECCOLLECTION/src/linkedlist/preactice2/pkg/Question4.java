/*
4.Implement a Student class with attributes like name and score, and implement the Comparable interface to sort a 
linked list of students based on their scores.
 */

package linkedlist.preactice2.pkg;

import java.util.Collections;
import java.util.LinkedList;

class Student implements Comparable<Student>
{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "\nname=" + name + ", score=" + score;
	}

	@Override
	public int compareTo(Student o) {
		if(this.score > o.score)
			return 1;
		else if(this.score < o.score)
			return -1;
		else
			return 0;
	}
}

public class Question4 
{
	public static void main(String[] args) 
	{
		LinkedList<Student> students = new LinkedList<Student>();
		students.add(new Student("Rahul", 86));
		students.add(new Student("Sham", 70));
		students.add(new Student("Vishal", 80));
		students.add(new Student("Raj", 48));
		students.add(new Student("Ajay", 53));
		students.add(new Student("Mayur", 69));
		
		System.out.println(students);
		
		System.out.println("\n List of student after sorting using Comparable :");
		Collections.sort(students);
		System.out.println(students);
	}
}
