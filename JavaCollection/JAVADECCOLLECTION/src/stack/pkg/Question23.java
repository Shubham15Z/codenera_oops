/*
23. Write a Java program that implements a stack and creates a new stack that 
contains all elements from two stacks without duplicates.
 */

package stack.pkg;

import java.util.Stack;

public class Question23 
{
	 public static void main(String[] args) {
	        Stack<Integer> stack1 = new Stack<>();
	        Stack<Integer> stack2 = new Stack<>();

	        // Fill stack1 and stack2
	        stack1.push(10);
	        stack1.push(20);
	        stack1.push(30);

	        stack2.push(20);
	        stack2.push(40);
	        stack2.push(10);

	        System.out.println("Stack1: " + stack1);
	        System.out.println("Stack2: " + stack2);

	        Stack<Integer> merged = new Stack<>();

	        for (int item : stack1) {
	            if (!contains(merged, item)) {
	                merged.push(item);
	            }
	        }

	        for (int item : stack2) {
	            if (!contains(merged, item)) {
	                merged.push(item);
	            }
	        }

	        System.out.println("Merged stack without duplicates: " + merged);
	    }

	    public static boolean contains(Stack<Integer> stack, int value) {
	        for (int item : stack) {
	            if (item == value) {
	                return true;
	            }
	        }
	        return false;
	    }
}
