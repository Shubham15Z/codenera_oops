/*
Write a program that prevents setting negative values for the age attribute in an EncapsulationDemo class.
 */

package dec.encapsulation.pkg;

class EncapsulationDemo1
{
	private int age;
	
	public void setAge(int age)
	{
		if(age > 0)
			this.age = age;
		else
			this.age = 0;
	}
	
	public int getAge()
	{
		return age;
	}
}

public class Question7 
{
	public static void main(String[] args) 
	{
		EncapsulationDemo1 d1 = new EncapsulationDemo1();
		d1.setAge(-5);
		System.out.println("The age is : "+d1.getAge());
		d1.setAge(10);
		System.out.println("The age is : "+d1.getAge());
	}
}
