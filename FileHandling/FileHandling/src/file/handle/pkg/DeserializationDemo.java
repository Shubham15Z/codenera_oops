package file.handle.pkg;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializationDemo 
{
	public static void main(String[] args)
	{
		try 
		{
			String file1 = "E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\que1";
			
			FileInputStream fis = new FileInputStream(file1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e1 = (Employee) ois.readObject();
			Employee e2 = (Employee) ois.readObject();
			
			System.out.println("Deserialized Employee ...");
			
			System.out.println(e1);
			System.out.println(e2);
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
