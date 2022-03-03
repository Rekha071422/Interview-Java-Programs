package InterviewJavaprograms.InterviewJavaprograms;

public class CompareTwoIntegerNum {

	
	//Integer cashing 
	//Range--> -128 to 127
	//if a=189 and b=189-->its out of range-->Output will be not equals
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareTwoNumber(189,189);
	}
	
	public static void compareTwoNumber(Integer a,Integer b)
	{
		if(a==b) 
			System.out.println("a and b are equals");
		else
			System.out.println("a and b are not eqauals");
	}

}
