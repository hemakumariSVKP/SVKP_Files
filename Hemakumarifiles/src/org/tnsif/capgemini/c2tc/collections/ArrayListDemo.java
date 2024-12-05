package org.tnsif.capgemini.c2tc.collections;

import java.util.ArrayList; 
import java.util.List;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		List<String> fruits =new ArrayList<>();
		fruits.add("apple");  //arraylist index starts with 1
		fruits.add("orange");
		fruits.add("cherry");
		fruits.add("Banana");
		
		System.out.println("All Fruits "+fruits);
		//Access The Element
		System.out.println("Third Fruit "+fruits.get(2));
		
		//Modify The Element
		fruits.set(3, "grapes");
		System.out.println("After Modification "+fruits);
		
		//Check if Element Exits
		if(fruits.contains("apple"))
		{
			System.out.println("Apple is in hte list");
			
			//Check the size of the arraylist
			System.out.println("Size of the arraylist "+fruits.size());
			
			//print all the element using a for-each loop
			for(String fruit :fruits)
			{
				System.out.println(fruit);
			}
			
			//clear all the element
			fruits.clear();
			System.out.println("List cleared number of fruits "+fruits.size());
		}
	}

}
