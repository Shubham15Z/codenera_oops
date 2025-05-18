/*
 You are tasked with creating a Java program that reads data from a text file and performs some operations 
 on that data. However, you need to handle potential exceptions that may occur during file input.

Requirements:

Create a Java program that reads data from a text file named "data.txt" located in the current directory.
 Each line of the file contains a single integer.

Write a function called calculateSum() that reads the integers from the file and calculates their sum. 

The function should throw a custom exception called FileReadException if any of the following conditions
 occur:
 
The file "data.txt" does not exist.
File ob = new File();
ob.isExist();  Boolean  false ->  FileReadException


The file is empty.

The file contains non-integer data (e.g., text instead of numbers).

Write a main method to execute the following steps: 

Attempt to call calculateSum().
Handle any FileReadException by displaying an error message.
If no exception occurs, display the sum of the integers read from the file.

Ensure that you close the file properly whether an exception is thrown or not.

Use proper exception handling techniques, such as try-catch blocks, to handle potential exceptions gracefully.

Your program should provide informative error messages for different exception scenarios and ensure that the file is closed properly in all cases.

Test your program with various scenarios, including files that don't exist, empty files, and files containing non-integer data
 */

package file.handle.pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileReadException extends Exception
{
	public FileReadException(String message) {
		super(message);
	}
}

public class CalculateSum
{
	public static int calculateSum() throws FileReadException
	{
		File f1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\data");
		
		if(!f1.exists())
		{
			throw new FileReadException("The file "+f1.getName()+" does not exist");
		}
		
		if(f1.length() == 0)
		{
			throw new FileReadException("The file is empty...");
		}
		
		
		Scanner sc = null;
		int sum = 0;
		
		try 
		{
			sc = new Scanner(f1);
			while(sc.hasNext())
			{
				if(sc.hasNextInt())
				{
					sum+=sc.nextInt();
				}
				else
				{
					throw new FileReadException("File contains non-integer data");
				}
			}
		}
		catch (FileNotFoundException e) 
		{
			throw new FileReadException("File not found due to unexpected error.");
		}
		finally 
		{
            if (sc != null) 
            {
                sc.close();
            }
        }
		return sum;
			
	}
	
	public static void main(String[] args) 
	{
		try {
			int sum = calculateSum();
			System.out.println("The sum is : "+sum);
		} catch (FileReadException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
