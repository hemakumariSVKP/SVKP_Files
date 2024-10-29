package operators;
// assign values to variables or modify the current value of a variable
public class AssignmentOperators 
{
	public static void main(String[] args) 
	{
		int b=10;
		//simple assignment
		int a=b; 
		System.out.println("b replace to a=" +b);
		//add and assign
		       a+=5; //a=a+5
		       System.out.println("a after +=" +a); //15
		
		//sub and assign
				a-=3; //a=a-3
				System.out.println("a after -=" +a); //a=15 now then 15-3=12
				
		//multiply and assign
				a*=2; //a=a*2
				System.out.println("a after *=" +a); //now a=12 then a*2=24
				
		//multiply and assign
				a/=4; //a=a/4
				System.out.println("a after /=" +a); //now a=24 then a/4=6
				
		//multiply and assign
				a%=3; //a=a%3
				System.out.println("a after %=" +a); //now a=6 then a%3=0
	}

}
