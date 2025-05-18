package file.handle.pkg;

import java.io.File;

public class FileInfoDemo
{
	public static void main(String[] args)
	{
		try 
		{
			File f1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\que1");
			
			if(f1.exists())
			{
				System.out.println("Name of File : "+f1.getName());
				System.out.println("Path of File : "+f1.getAbsolutePath());
				
				System.out.println("Can file have read mode : "+f1.canRead());
				System.out.println("Can file have write mode : "+f1.canWrite());
				
				System.out.println("FIle size in byte : "+f1.length());
			}
			else
			{
				System.out.println("File does not exists...");
			}
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
