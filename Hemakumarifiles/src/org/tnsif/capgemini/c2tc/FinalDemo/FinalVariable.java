package org.tnsif.capgemini.c2tc.FinalDemo;

public class FinalVariable 
{
	public static void main(String[] args)
	{
		//final dint  mark_scored_leela=50; 
	 int  mark_scored_leela=50;
		mark_scored_leela=80;
		//mark_scored_leela=80; //final variable can't be changed
		System.out.println(mark_scored_leela);
	}
}