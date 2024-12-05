package org.tnsif.capgemini.c2tc.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		List<String> cars=new LinkedList<>();
		cars.add("BMW");
		cars.add("Tasla");
		cars.add("Toyota");
		cars.add("Tata");
		cars.add("Tesla");
		
		//access element
		System.out.println("car :"+cars.get(2));
		
		//modify an element
		cars.set(3,"Audi");
		
		//remove an element
		cars.remove("BMW");
		
		//Check if an element exits
		if(cars.contains("Toyota"));
		{
			System.out.println("Toyota is present");
		}
		//print all the elements
		for(String car:cars)
		{
			System.out.println(car);
		}
		
		//get the size of the linked list
		System.out.println("Number of cars "+cars.size());
		
		//clear all the elements
		cars.clear();
		System.out.println("Number of cars "+cars.size());
	}

}
