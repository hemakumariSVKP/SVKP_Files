package org.tnsif.capgemini.c2tc.Interface;

//another class implementing the same interface
public class Bike implements Vehicle1
{
   private String type;
   
   public Bike(String type)
   {
  	 this.type=type;
   }
	public void start() 
	{
		System.out.println("Bike " + type + " is starting");
	}

	public void stop() 
	{
		System.out.println("Bike " + type+ " is stopping");
	}

}