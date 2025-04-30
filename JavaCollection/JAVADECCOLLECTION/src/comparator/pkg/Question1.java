/*
 * Implement the Comparable interface for a class representing a Person with attributes like name, age, and height. 
 * Sort an array of Person objects based on their age.
 */
package comparator.pkg;

import java.util.Collections;
import java.util.LinkedList;

class Person implements Comparable<Person>
{
	private String name;
	private int age;
	private double height;
	
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "\nname=" + name + ", age=" + age + ", height=" + height;
	}

	@Override
	public int compareTo(Person o) {
		if(this.age > o.getAge())
			return 1;
		else if(this.age < o.getAge())
			return -1;
		else
			return 0;
	}
}
public class Question1 
{
	public static void main(String[] args) 
	{
		LinkedList<Person> person = new LinkedList<Person>(); 
		person.add(new Person("Rahul", 50,5.8));
		person.add(new Person("Virat", 35,5.6));
		person.add(new Person("Scahin", 45,4.9));
		person.add(new Person("Sehwagh", 48,5.5));
		
		System.out.println(person);
		
		Collections.sort(person);
		System.out.println("\nAfter Sort based on Age");
		System.out.println(person);
		
	}
}
