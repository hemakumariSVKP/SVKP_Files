package operators;
//these operators are used to combine multiple conditions(return boolean value)
public class LogicalOperators 
{
	public static void main(String[] args) 
	{
		int a=10,b=5,c=15;
		System.out.println("(a>b) && (b<c) "+((a>b) && (b<c)));//logical AND
		System.out.println("(a>b) || (b<c) "+((a>b) || (b<c)));//logical OR
		System.out.println("(!(a>b) "+(!(a>b)));//logical NOT
	}
}
