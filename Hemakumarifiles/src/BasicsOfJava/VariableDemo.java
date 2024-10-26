package BasicsOfJava;

public class VariableDemo {
	                    int a=10;//instance variable
	                    void print()
	                     {
                          String msg="hello";//local variable
                          System.out.println(msg);
	                     }
	     static String message="hello students";//static variable
	     public static void main(String[] args)
	                     {
	                	  VariableDemo obj=new VariableDemo();
	                	  System.out.println(obj.a);
	                	  obj.print();
	                	  System.out.print(message);

	}

}
