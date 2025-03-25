/*
7. Create a ProductNotFoundException for an e-commerce application if the product ID is invalid.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;


class ProductNotFound extends Exception
{
	public ProductNotFound(String message) {
		super(message);
	}
}

public class Question7
{
	public static void checkProduct(String id) throws ProductNotFound
	{
		if(id.isEmpty())
		{
			throw new ProductNotFound("Product with this id does not exist...");
		}
		else
			System.out.println("Product is available...");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Id : ");
		String pass = sc.nextLine();
		
		try
		{
			checkProduct(pass);
		}
		catch(ProductNotFound e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
