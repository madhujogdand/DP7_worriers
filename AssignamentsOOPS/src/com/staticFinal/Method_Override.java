package com.staticFinal;

class Animal
{
	 void makeSound()
	 {
	        System.out.println("The animal makes a sound");
	  }
}
	class Dog extends Animal
	{
	    @Override
	    void makeSound()
	    {
	        System.out.println("The dog barks");
	    }
	}
	class Cat extends Animal
	{
	    @Override
	    void makeSound()
	    {
	        System.out.println("The cat meows");
	    }
	}
	public class Method_Override
	{
	    public static void main(String[] args)
	    {
	        Animal animal1 = new Animal();
	        Animal animal2 = new Dog();
	        Animal animal3 = new Cat();

	        animal1.makeSound(); // Calls the Animal class's makeSound method
	        animal2.makeSound(); // Calls the Dog class's overridden makeSound method
	        animal3.makeSound(); // Calls the Cat class's overridden makeSound method
	    }

}
