package file.handle.pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFileDemo
{
	public static void main(String[] args) 
	{
		try 
		{
			File f1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\file1");
			Scanner sc = new Scanner(f1);
			StringBuffer sb = new StringBuffer();
			
			while(sc.hasNext())
			{
//				System.out.println(sc.nextLine());
				sb.append(sc.nextLine());
			}
			System.out.println(sb);
			
			String s = String.valueOf(sb);
			String[] str = s.split(" ");
			System.out.println(Arrays.toString(str));
			
			System.out.println("Number of words in file : "+str.length);
			
			for(int i = 0; i < str.length; i++)
			{
				System.out.println(Character.toUpperCase(str[i].charAt(0))+""+str[i].substring(1));
			}
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
