package BasicsOfJava;
class sample
 {
	int i;
	byte b;
	float f;
	double d;
	char  c1;
	boolean b1;
	String strvalue;//instance var
	int a[];
  }
    public class DefaultValueChecking
    {
	  public static void main(String[] args) 
	  {
		sample d1=new sample();
		System.out.println("int default value = "+d1.i);
		System.out.println("byte default value = "+d1.b);
		System.out.println("float default value = "+d1.f);
		System.out.println("double default value = "+d1.d);
		System.out.println(d1.c1 ); //not visible when printed because it is null character
		System.out.println("boolean default value = "+d1.b1);
		System.out.println("string default value = "+d1.strvalue);
		System.out.println("array default value = "+d1.a);
	  }
   }