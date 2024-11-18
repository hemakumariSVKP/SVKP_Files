package org.tnsif.capgemini.c2tc.oops;

class Animal3
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog3 extends Animal3
{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
class Cat3 extends Animal3
{
	void meow()
	{
		System.out.println("cat is barking");
	}
}
class Elephant3 extends Animal3
{
	void trumpet()
	{
		System.out.println("Elephant is trumping");
	}
}

public class Hierarchical_Inhertance {

	public static void main(String[] args) {
		Dog3 dog=new Dog3();
		Cat3 cat=new Cat3();
		Elephant3 ele=new Elephant3();
		dog.eat();
		cat.eat();
		ele.eat();
		
		dog.bark();
		cat.meow();
		ele.trumpet();

	}

}
