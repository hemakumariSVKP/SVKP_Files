package org.tnsif.capgemini.c2tc.Exception;

public class ArrayIndex 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[4]; //4 ELEMENTS
		try
		{
		  int i=arr[8];
		  System.out.println(i);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Whatever happen this line gets executed");
		}
	}

}
