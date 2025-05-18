/*
1. create file
2. write file
3. read file
4. delete file
5. file info
 */


package file.handle.pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleMenu
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the option you want to perform\n"
				+ "1. Create File \n"
				+ "2. Write File \n"
				+ "3. Read File \n"
				+ "4. Delete File \n"
				+ "5. Get File Info\n");
		
		int choice = sc.nextInt();
		
		System.out.println(choice);
		
		switch (choice) {
		case 1: {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter file name to create : \n");
			String fname1 = sc1.nextLine();
			File f1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\"+fname1);
			
			try 
			{
				boolean b = f1.createNewFile();
				if(b)
					System.out.println("Your File "+fname1+" is created successfully.....");
				else
					System.out.println("Something went wrong.....");
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			sc1.close();
			break;
		}
		case 2: {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter file name to write : \n");
			String fname1 = sc2.nextLine();
			
			try
			{
				FileWriter fw = new FileWriter("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\"+fname1);
				System.out.println("Enter some text : \n");
				String text = sc2.nextLine();
				fw.write(text);
				fw.close();
				System.out.println("Content added successfully....");
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
			sc2.close();
			break;
		}
		case 3: {
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter file name to read data : \n");
			String fname3 = sc3.nextLine();
			File f3 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\"+fname3);
			
			try 
			{
				Scanner sc301 = new Scanner(f3);
				StringBuffer sb = new StringBuffer();
				while(sc301.hasNext())
				{
					sb.append(sc301.nextLine());
				}
				System.out.println(sb);
				sc301.close();
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			sc3.close();
			break;
			
		}
		case 4: {
			try 
			{
				Scanner sc4 = new Scanner(System.in);
				System.out.println("Enter file name to delete : \n");
				String fname4 = sc4.nextLine();
				File f1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\"+fname4);
				
				boolean b = f1.delete();
				if(b)
					System.out.println("File deleted successfully...");
				else
					System.out.println("Something went wrong...");
				sc4.close();
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
			break;
		}
		case 5: {
			try 
			{
				Scanner sc5 = new Scanner(System.in);
				System.out.println("Enter file name to get info : \n");
				String fname5 = sc5.nextLine();
				File f1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\"+fname5);
				
				if(f1.exists())
				{
					System.out.println("Name of File : "+f1.getName());
					System.out.println("Path of File : "+f1.getAbsolutePath());
					
					System.out.println("Can file have read mode : "+f1.canRead());
					System.out.println("Can file have write mode : "+f1.canWrite());
					
					System.out.println("File size in byte : "+f1.length());
				}
				else
				{
					System.out.println("File does not exists...");
				}
				sc5.close();
			} 
			catch (Exception e)
			{
				System.out.println(e);
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
}
