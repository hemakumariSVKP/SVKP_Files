package decisionMaking;

public class IfElseIfDemo {

	public static void main(String[] args) {
	int score=94;
		
		if(score>90)//score is above 90 you have grade A
		{
			System.out.println("Grade A");
		}
		else if(score>=80)//score is above 79 you have grade B
		{
			System.out.println("Grade B");
		}
		else if(score>=70)//score is above 69 you have grade C
		{
			System.out.println("Grade c");
		}
		else if(score>60)//score is above 59 you have grade D
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
