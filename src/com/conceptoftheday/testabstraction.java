package com.conceptoftheday;

abstract class Animal
{
	abstract void soundofanimal();

}


class Cat extends Animal
{

	@Override
	void soundofanimal() {
	
		System.out.println("meow");
	}
	
}


class Dog extends Animal
{

	@Override
	void soundofanimal() {
	
		System.out.println("BOW BOW ");
	}
	
}

public class testabstraction {

	public static void main(String args[])
   
	{
		Dog d = new Dog();
		d.soundofanimal();
		
		Cat c = new Cat();
		c.soundofanimal();
	}
}
