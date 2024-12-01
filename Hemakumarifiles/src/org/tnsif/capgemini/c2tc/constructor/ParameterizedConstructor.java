package org.tnsif.capgemini.c2tc.constructor;

class Myclass2
{
	String color;
	int cost;
	String brand;
	
	
	//Parameterized  constructor
	Myclass2(String color, int cost ,String brand)
	{
		this.color=color;
		this.cost=cost;
		this.brand=brand;
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Myclass2 obj=new Myclass2("black",460500000,"benz");
		Myclass2 obj1=new Myclass2("grey ",550400000,"lumborghini");
		System.out.println(obj.color + " "+ obj.cost+ " " +obj.brand);
		System.out.println(obj1.color + " "+ obj1.cost+ " " +obj1.brand);

	}

}