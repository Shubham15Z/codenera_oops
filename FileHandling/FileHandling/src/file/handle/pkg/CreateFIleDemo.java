package file.handle.pkg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFIleDemo 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name which you want to create : ");
		
		String file_name = sc.next();
		
		File f1 = new File("C:\\Users\\SHIVANI\\Documents\\files\\"+file_name);
		
		boolean b = f1.createNewFile();
		
		if(b)
		{
			System.out.println("Your File "+file_name+" is created successfully.....");
		}
		else
		{
			System.out.println("Something went wrong.....");
		}	
	}
}
