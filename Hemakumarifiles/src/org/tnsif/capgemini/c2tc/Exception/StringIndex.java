package org.tnsif.capgemini.c2tc.Exception;

public class StringIndex 
{
	public static void main(String[] args) 
	{
		String str="hello";//0-4
		try 
		{
			char ch=str.charAt(9 );
			System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This block will get Executed regardless of exception");
		}
	}
}
