package com.agile.oops;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal m1=new Mammal();
		m1.speak();
		Animal a1=new Animal();
		a1.speak();
		Dog d1=new Dog();
		d1.speak();
	}
	
}
	class Animal{
		void speak()
		{
			System.out.println("Animal Speaking");
		}
	}
	class Mammal extends Animal{
		void speak()
		{
			System.out.println("Mammal Speaking");
		}
	}
	class Dog extends Mammal{
		void speak()
		{
			System.out.println("BOW BOW");
		}
	}
	

	