package practice.oop.java.pkg;


abstract class Animal
{
	abstract String makeSound();
}

class Dog extends Animal
{
	public String makeSound()
	{
		return "Dog Barks..";
	}
}

class Cat extends Animal
{
	public String makeSound()
	{
		return "Cat Meow...";
	}
}
public class Question3 
{
	public static void main(String[] args) {
		Animal a1 = new Dog();
		System.out.println(a1.makeSound());
		Animal a2 = new Cat();
		System.out.println(a2.makeSound());
	}
}
