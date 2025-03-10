/*
5. Extract the file name and extension from a file path using split().
 */

package dec.java.str.method.practice2.pkg;

public class Question5 
{
	String filePath = "C:\\Users\\hrish\\Documents\\report.pdf";
	
	void splitWord()
	{
		String[] s1 =  filePath.split("\\\\");
		String s2 = s1[s1.length-1];
		
		String[] s3 = s2.split("\\.");
		
		
		System.out.println("File name is : "+s3[0]);
		System.out.println("File extension is : "+s3[1]);

	}
	public static void main(String[] args)
	{
		Question5 q5 = new Question5();
		q5.splitWord();
	}
}
