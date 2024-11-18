package org.tnsif.capgemini.c2tc.oops;

public class Abstraction {

	public static void main(String[] args) {
		HemaDemo obj=new RameshDemo();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteComm();
		obj.HealithMonitoring();
	}

}
abstract class HemaDemo{
	public void calling() //concrete method
	{
		System.out.println("calling");
	}
	public abstract void AIIntegration();//abstract method
	public abstract void SatelliteComm();
	public abstract void HealithMonitoring();
	
}

abstract class SatyaDemo extends HemaDemo
{
	public void AIIntegration()
	{
		System.out.println("phone is integrated with AIIntegration");
	}
}
class RameshDemo extends SatyaDemo
{

	@Override
	public void SatelliteComm() {
		System.out.println("phone is integrated with SatelliteComm");
		
	}

	@Override
	public void HealithMonitoring() {
		System.out.println("phone is integrated with HealithMonitoring");
		
	}
	
}