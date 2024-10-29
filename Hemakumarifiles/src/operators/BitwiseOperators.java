package operators;

public class BitwiseOperators
{
	public static void main(String[] args)
	 {
		int a=5; //0101
		int b=3; //0011
		
		//Bitwise AND operator
		    System.out.println("(a&b) :"+(a&b));//0001(1)

		//Bitwise OR operator
			System.out.println("(a|b) :"+(a|b));//0111(7)
			
		//Bitwise XOR operator
			System.out.println("(a^b) :"+(a^b));//0110(6)
			
		//Bitwise NOT operator
		//invert all bits result depends on system
			System.out.println("(~a) :"+(~a));//0110(-6)
			
		//Left shift
			System.out.println("(a<<3) :"+(a<<3));//5*2^b =40
			
		//Right shift
			System.out.println("(a>>2) :"+(a>>2));//5/2^b =1
	}

}
