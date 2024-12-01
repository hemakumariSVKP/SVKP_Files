package org.tnsif.capgemini.c2tc.Interface;

//implement the interface in a class
public class Car implements Vehicle1
{
  private String model;
  
  //constructor       
 public Car(String model)
 {
	   this.model=model;
 }
	public  void start() 
	{
		
		System.out.println("Car " + model + " is starting");
	}
	public void stop()
	{
		System.out.println("Car " +model +" is stopped");
		
	}
}