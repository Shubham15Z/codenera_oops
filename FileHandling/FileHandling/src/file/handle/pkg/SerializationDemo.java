package file.handle.pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	private static final long serialVersionUID = 1L; 
	private int id;
	private String name;
	private int salary;
	private String city;
	transient private String password;
	public Employee(int id, String name, int salary, String city, String password) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.password = password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + ", password="
				+ password + "]";
	}
	
	
}

public class SerializationDemo 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(101, "Ajay", 25000, "Pune", "ajay123");
		Employee e2 = new Employee(102, "Mayur", 28000, "Mumbai", "mayur123");
		
		File f1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\que1");
		
		try
		{
			FileOutputStream fos = new FileOutputStream(f1);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(e1);
			oos.writeObject(e2);
			
			oos.close();
			fos.close();
			
			System.out.println("Object Successfully Write.....");
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
