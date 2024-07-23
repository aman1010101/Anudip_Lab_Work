package com;


class Animal{
	void makeSound() {
		System.out.println(">>>The animal makes a sound");
	}
	
}
class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println(">>>The Dogs barks");
	}
	
	
}
class Cat extends Animal{
	void makeSound() {
		System.out.println(">>>The Cats meows");
	}
	
}

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal= new Animal();
		Dog dog= new Dog();
		Cat cat = new Cat();
		System.out.println("-------------------------------------");
		animal.makeSound();
		dog.makeSound();
		cat.makeSound();

	}

}
