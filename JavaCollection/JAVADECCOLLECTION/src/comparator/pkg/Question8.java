/*
8. Comparator for Null Handling:
Modify the Book class from a previous question to allow for null values in the author field. 
Create a custom Comparator to sort the list of books, placing those with a null author at the end.
 */

package comparator.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortAuthorNull implements Comparator<Book>
{
	public int compare(Book b1, Book b2)
	{
		String author1 = b1.getAuthor();
		String author2 = b2.getAuthor();
		
		if(author1 == null && author2 == null)
		{
			return 0;
		}
		
		if(author1 == null)
		{
			return 1;
		}
		
		if(author2 == null)
		{
			return -1;
		}
		
		return author1.compareTo(author2);
	}
}

public class Question8 
{
	public static void main(String[] args) 
	{
		ArrayList<Book> book = new ArrayList<Book>();
		book.add(new Book("To Kill a Mockingbird",	"Harper Lee",	1960));
		book.add(new Book("1984",	null,	1949));
		book.add(new Book("Pride and Prejudice",	"Jane Austen",	1813));
		book.add(new Book("The Great Gatsby",	null,	1925));
		book.add(new Book("The Catcher in the Rye",	"J.D. Salinger",	1951));
		
		System.out.println(book);
		System.out.println("\nSorting Author name using comparator having some null values");
		Collections.sort(book, new SortAuthorNull());
		System.out.println(book);

		
	}
}
