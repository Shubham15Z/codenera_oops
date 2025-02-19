/*
 Define an abstract class Animal with an abstract method makeSound(). 
 Implement two subclasses Dog and Cat that provide specific implementations of makeSound().
 */

package abstarction.practice.pkg;

abstract class Animal
{
	abstract void makeSound();
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat Meows");
	}
}
public class Question2 
{
	public static void main(String[] args) 
	{
		Animal ob = new Dog();
		ob.makeSound();
		Animal ob1 = new Cat();
		ob1.makeSound();
	}
}
