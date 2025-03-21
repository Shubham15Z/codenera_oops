/*
14. Write a Java program that uses a try-catch block inside a method.
 */

package dec.java.exception.pkg;

public class Question14 
{
	 void divide(int a, int b) {
	        try 
	        {
	            int result = a / b; 
	            System.out.println("Result: " + result);
	        } 
	        catch (ArithmeticException e) 
	        {
	            System.out.println(e);
	        }
	    }

	    public static void main(String[] args) {
	    	Question14 q15 = new Question14();

	    	q15.divide(10, 2);
	        q15.divide(10, 0);
	        
	        System.out.println("Program continues after exception handling...");
	    }
}
