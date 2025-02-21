/*
Design a Book class with private attributes title and author. 
Allow setting and retrieving values using methods.
 */

package dec.encapsulation.pkg;

class Book
{
	private String title;
	private String author;
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
}

public class Question6 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		b1.setAuthor("Rajat Sharma");
		b1.setTitle("My Life Story");
		
		System.out.println("The Book details are : Author = "+b1.getAuthor()+" Title = "+b1.getTitle());
	}
}
