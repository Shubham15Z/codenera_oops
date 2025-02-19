package dec.polymorphism.practice.pkg;


class Animal
{
	void sound()
	{
		System.out.println("Animal make sound");
	}
}

class Bird extends Animal
{
	void sound()
	{
		System.out.println("Birds chirps");
	}
}

class Cat extends Animal
{
	void sound()
	{
		System.out.println("Cat Meows");
	}
}

public class Question1 {
	public static void main(String[] args) 
	{
		Animal animal;
		animal = new Animal();
		animal.sound();
		
		animal = new Bird();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
	}
}
