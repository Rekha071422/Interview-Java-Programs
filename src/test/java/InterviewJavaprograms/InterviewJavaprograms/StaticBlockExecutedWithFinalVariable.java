package InterviewJavaprograms.InterviewJavaprograms;

public class StaticBlockExecutedWithFinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(StaticBlockWithFinalVariable.x);
	}
	

}

class StaticBlockWithFinalVariable
{
	public static final int x=100;
	static
	{
		System.out.println("Static block executed with final variable");
	}
	
}
