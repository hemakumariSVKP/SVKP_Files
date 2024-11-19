package org.tnsif.capgemini.c2tc.oops;

class Vehicles
{
	void move()
	{
		System.out.println("The vehicle moves");
	}
}
class Car extends Vehicles
{
	void move()
	{
		System.out.println("The car drives");
	}
}
class Bicycle extends Vehicles
{
	void move()
	{
		System.out.println("The bicycle pedals");
	}
}
class Airplane extends Vehicles
{
	void move()
	{
		System.out.println("The Airplane flies");
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		Vehicles obj=new Vehicles();
		obj=new Car();
		obj.move();
		obj=new Bicycle();
		obj.move();
		obj=new Airplane();
		obj.move();
	}

}
