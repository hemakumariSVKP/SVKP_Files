package operators;
//increase or decrease the value of a variable by 1
public class Incre_DecreOperators 
{
	public static void main(String[] args)
  {
	int a=10;
	
	//post increment
	    System.out.println("a++ "+ a++);//print first then increment
	    System.out.println("after post-increment a=" +a);

	//pre-increment
		System.out.println("++a "+ ++a);//increment first then print
		System.out.println("after pre-increment a=" +a);
		
	//post decrement
		System.out.println("a-- "+ a--);//print first then decrement
		System.out.println("after post-decrement a=" +a);

	//pre-decrement
		System.out.println("--a "+ --a);//decrement first then print
		System.out.println("after pre-decrement a=" +a);
	}
}
