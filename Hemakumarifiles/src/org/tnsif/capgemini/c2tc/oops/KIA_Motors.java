package org.tnsif.capgemini.c2tc.oops;

public class KIA_Motors {
	int noCar;
	String model;
	String engine;
	int speed;
	void display()
	{
		System.out.println("This is KIA MOTORS , Welcome to our show room");
	}
	void welcome()
	{
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		KIA_Motors  obj=new KIA_Motors();
		obj.display();
		obj.welcome();
		obj.noCar=2244;
		obj.model="KIA";
		obj.engine="petrol stream";
		obj.speed=80;
		System.out.println(obj.noCar);
		System.out.println(obj.model);
		System.out.println(obj.engine);
		System.out.println(obj.speed);
	}

}
