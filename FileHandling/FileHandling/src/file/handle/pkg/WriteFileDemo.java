package file.handle.pkg;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFileDemo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file name : ");
		String file_name = sc.next();
		sc.nextLine();
		
		try 
		{
			FileWriter fw = new FileWriter("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\"+file_name);	
			System.out.println("Enter some text that you want to write in file..");
			String str = sc.nextLine();
			fw.write(str);
			fw.close();
			System.out.println("Content added successfully....");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
