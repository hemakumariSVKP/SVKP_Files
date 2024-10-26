package BasicsOfJava;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//implicit casting
		byte b=127;
     	int i=b;
     	System.out.println("--IMPLICIT CASTING");
		System.out.println(" "+i);
		
	
		float f1=22.14f;
		double d1=f1;
		System.out.println(" "+d1+"\n");
		
	//Explicit casting
	  //here are some data loss
	    double d2=10.52d;
		long l=(long)d2;
		System.out.println("--EXPLICIT CASTING");
		System.out.println(" "+l);
		
		
		float f2=34.56f;
		int li=(int)f2;
		System.out.println(" "+li);

	}

}
