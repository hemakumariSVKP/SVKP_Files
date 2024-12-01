package org.tnsif.capgemini.c2tc.Interface;

public class MarkerDemo 
{
	public static void main(String[] args) 
	{
		Registrable s=new Student(101,"sankar",15000,"java");
		Registrable s1=new Student(102,"lakshmi",13000,"c#");
		Object obj=new Object();//the class Object is a built-in class in java that is part of java.lang.package
			if (s1 instanceof Registrable)
				System.out.println("Student is registered for course");
			else
				System.out.println("Student is not registered for course");
	}

}