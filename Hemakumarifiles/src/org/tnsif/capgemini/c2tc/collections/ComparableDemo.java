package org.tnsif.capgemini.c2tc.collections;

import java.util.ArrayList;
import java.util.Collections;

class Persons implements Comparable<Persons>
{
	String name;
	 int age;
	 public Persons(String name, int age)
	 {
		 this.name =name;
			this.age=age; 
	 }
	 void displayinfo()
	 {
		 System.out.println("Name :"+name+" Age "+age);
	 }
	 
	 //Sorting by age
	@Override
	public int compareTo(Persons other) {
		// TODO Auto-generated method stub
		return this.age-other.age;
	}
}
public class ComparableDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Persons> people=new ArrayList<>();
		people.add(new Persons("Satya",15));
		people.add(new Persons("Hema",20));
		people.add(new Persons("jaya",22));
		
		Collections.sort(people);
		
		for(Persons person:people)
		{
			person.displayinfo();
		}
	}

}
