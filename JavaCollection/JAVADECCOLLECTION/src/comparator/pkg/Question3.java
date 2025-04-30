/*
3. Multiple Sorting Criteria:
Define a class representing a Book with attributes like title, author, and publication year. 
Implement both Comparable and a custom Comparator to sort a list of Books first by author and then by publication year.
 */

package comparator.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Book implements Comparable<Book>
{
	private String title;
	private String author;
	private int publishYear;
	
	public Book(String title, String author, int publishYear) {
		super();
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublishYear() {
		return publishYear;
	}

	@Override
	public String toString() {
		return "\nTitle = " + title + ", Author = " + author + ", PublishYear = " + publishYear;
	}

	@Override
	public int compareTo(Book o) {
		if(this.author.compareTo(o.getAuthor()) > 0)
			return 1;
		else if(this.author.compareTo(o.getAuthor()) < 0)
			return -1;
		else
			return 0;
	}
}

class SortAuthor implements Comparator<Book>
{
	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getAuthor().compareTo(o2.getAuthor()) > 0)
			return 1;
		else if(o1.getAuthor().compareTo(o2.getAuthor()) < 0)
			return -1;
		else
			return 0;
	}
}

class SortPublishYear implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getPublishYear() > o2.getPublishYear())
			return 1;
		else if(o1.getPublishYear() < o2.getPublishYear())
			return -1;
		else
			return 0;
	}
	
}

public class Question3 
{
	public static void main(String[] args) 
	{
		ArrayList<Book> book = new ArrayList<Book>();
		book.add(new Book("To Kill a Mockingbird",	"Harper Lee",	1960));
		book.add(new Book("1984",	"George Orwell",	1949));
		book.add(new Book("Pride and Prejudice",	"Jane Austen",	1813));
		book.add(new Book("The Great Gatsby",	"F. Scott Fitzgerald",	1925));
		book.add(new Book("The Catcher in the Rye",	"J.D. Salinger",	1951));
		
		System.out.println(book);
		System.out.println("\nSorting Author name using comparable...");
		Collections.sort(book);
		System.out.println(book);
		
		System.out.println("\nSorting Author name using Comparator....");
		Collections.sort(book, new SortAuthor());
		System.out.println(book);
		
		System.out.println("\nSorting Publish Year using Comparator....");
		Collections.sort(book, new SortPublishYear());
		System.out.println(book);
		
	}
}
