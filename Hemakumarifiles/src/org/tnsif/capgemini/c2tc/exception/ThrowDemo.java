package org.tnsif.capgemini.c2tc.exception;

public class ThrowDemo 
{
	 void Validate(int age)
	{
	 if(age<18)
		{
		    //throw new ArithmeticException("They are not eligible for C2TC");
			System.out.println("You are not Eligible");
		}
		else
		{
			System.out.println("You are Eligible");
		}
	}
	 public static void main(String[] args)
	 {
		 ThrowDemo obj=new ThrowDemo();
		 obj.Validate(4);
		 //System.out.println("Welcome C2TC");
	 }
}
