package org.tnsif.capgemini.c2tc.exception;

public class MultipleCatchDemo 
{
	public static void main(String[] args) 
	{
		int numbers[]=new int[4];
		try
		{
			numbers[9]=50/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds "+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("An unexpected error occured "+e.getMessage());
		}
	}
}
