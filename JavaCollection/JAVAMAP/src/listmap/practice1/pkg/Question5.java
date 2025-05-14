/*
Question 5: Group students by their grades.
Write a method that takes a list of Student objects as input, where each Student has a name and a grade. 
The method should return a map where the keys are the distinct grades and the values are lists of students who have that grade. 
Use the Stream API to solve this problem.
 */
package listmap.practice1.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student
{
	private String name;
	private String grade;
	
	public Student(String name, String grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}

public class Question5 
{
	public static Map<String, List<Student>> groupStudentByGrade(List<Student> list1)
	{
		return list1.stream().collect(Collectors.groupingBy(s -> s.getGrade()));
	}
	public static void main(String[] args)
	{
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student("Rahul", "C"));
		list1.add(new Student("Vishal", "B"));
		list1.add(new Student("Mayur", "C"));
		list1.add(new Student("Ajay", "A"));
		list1.add(new Student("Kirti", "D"));
		list1.add(new Student("Pooja", "E"));
		list1.add(new Student("Riya", "A"));
		list1.add(new Student("Manoj", "B"));
		list1.add(new Student("Payal", "C"));
		list1.add(new Student("Akshay", "A"));
				
		Map<String, List<Student>> res = groupStudentByGrade(list1);
		
		for(Map.Entry<String, List<Student>> entry : res.entrySet())
		{
			System.out.println("Grade "+entry.getKey() + " : "+entry.getValue());
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
