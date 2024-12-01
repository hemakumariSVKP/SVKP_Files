package org.tnsif.capgemini.c2tc.constructor;

class Myclass1
{
	String color;
	int cost;
	String brand;
	
	
	//default constructor
	Myclass1()
	{
		color="BLACK";
		cost=5000000;
		brand="Audi";
	}
}



public class DefaultConsturctor 
{

	public static void main(String[] args) 
	{
		Myclass1 obj=new Myclass1();
		System.out.println(obj.color + " "+ obj.cost+ " " +obj.brand);
		System.out.println(obj.color + " "+ obj.cost+ " " +obj.brand);
		

	}

}