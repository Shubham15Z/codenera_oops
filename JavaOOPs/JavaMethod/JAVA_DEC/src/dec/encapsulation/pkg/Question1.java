/*
 Create a class Person with private variables name and age. 
 Provide getter and setter methods to access and modify them.
 */

package dec.encapsulation.pkg;

class Person
{
	private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
}

public class Question1 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setName("Rahul");
		p1.setAge(25);
		
		System.out.println("The person details are : "+p1.getName()+"  "+p1.getAge());
	}
}
