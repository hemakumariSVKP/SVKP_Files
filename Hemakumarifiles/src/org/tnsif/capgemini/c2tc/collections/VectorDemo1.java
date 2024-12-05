package org.tnsif.capgemini.c2tc.collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo1 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers=new Vector<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		//access the elements
		System.out.println("First Number : "+numbers.get(0));
		
		//modify an element
		numbers.set(1,25);
		
		//remove an element
		numbers.remove(3);
		System.out.println(numbers);
		
		//check if exits
		if(numbers.contains(10))
		{
			System.out.println("10 is present");
		}
		
		//print all elements
		for(Integer num :numbers)
		{
			System.out.println(num);
		}
		
		//size
		System.out.println("Size of vector data : "+numbers.size());
		//clear
		numbers.clear();
		System.out.println("List after clear operation : "+numbers);
	}
}
