package file.handle.pkg;

import java.io.File;

public class DeleteFileDemo 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			File f1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\file1");
			
			boolean b = f1.delete();
			
			if(b)
			{
				System.out.println("File deleted successfully...");
			}
			else
			{
				System.out.println("Something went wrong...");
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}
}
