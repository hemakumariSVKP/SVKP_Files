package org.tnsif.capgemini.c2tc.wrapperclass;

public class AutoBoxing_UnBoxing 
{
	public static void main(String[] args) 
	{
		//autoboxing :primitive datatype to wrapper class
		byte primitivebyte=1;
		Byte wrrapperbyte =primitivebyte;
		System.out.println("Autoboxing " +wrrapperbyte);
		
		//unboxing :wrapper class to primitive datatype
		byte unboxedbyte =wrrapperbyte;
		System.out.println("Unboxed " +unboxedbyte);
		
		//autoboxing
		short primitiveshort=2;
		Short wrappershort=primitiveshort;
		System.out.println("Autoboxing " +wrappershort);
		
		//unboxing
		
		short unboxedshort=wrappershort;
		System.out.println("Unboxed " +unboxedshort);
		
		 int primitiveInt = 3;
	     Integer wrapperInt = primitiveInt; // Autoboxing
	     System.out.println("Autoboxed Integer: " + wrapperInt);
	        

	     int unboxedInt = wrapperInt; // Unboxing
	     System.out.println("Unboxed int: " + unboxedInt);
		
		long primitiveLong = 6L;
        Long wrapperLong = primitiveLong; // Autoboxing
        System.out.println("Autoboxed Long: " + wrapperLong);

        long unboxedLong = wrapperLong; // Unboxing
        System.out.println("Unboxed long: " + unboxedLong);

        float primitiveFloat = 3.14f;
        Float wrapperFloat = primitiveFloat; // Autoboxing
        System.out.println("Autoboxed Float: " + wrapperFloat);
        

        float unboxedFloat = wrapperFloat; // Unboxing
        System.out.println("Unboxed float: " + unboxedFloat);

        double primitiveDouble = 4.9d;
        Double wrapperDouble = primitiveDouble; // Autoboxing
        System.out.println("Autoboxed Double: " + wrapperDouble);
        

        double unboxedDouble = wrapperDouble; // Unboxing
        System.out.println("Unboxed double: " + unboxedDouble);


        char primitiveChar = 'h';
        Character wrapperChar = primitiveChar; // Autoboxing
        System.out.println("Autoboxed Character: " + wrapperChar);
        
        char unboxedChar = wrapperChar; // Unboxing
        System.out.println("Unboxed char: " + unboxedChar);

        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = primitiveBoolean; // Autoboxing
        System.out.println("Autoboxed Boolean: " + wrapperBoolean);

        boolean unboxedBoolean = wrapperBoolean; // Unboxing
        System.out.println("Unboxed boolean: " + unboxedBoolean);	
	}
}