package org.tnsif.capgemini.c2tc.oops;
class Human1
{
	private int age;
	private String name;
  public void setAge(int a)
	{
	age=a;
	}
  public int getAge()
	{
	return age;
	}
  public void setName(String n)
	{
	name=n;
	}
public String getName()
	{
	return name;
	}
	}
public class Encapsulation {
	public static void main(String[] args) {
		Human1 obj=new Human1();
		obj.setAge(12);
		obj.setName("hema");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(22);
		obj.setName("satya");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}
}