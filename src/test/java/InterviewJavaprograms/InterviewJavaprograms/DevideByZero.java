package InterviewJavaprograms.InterviewJavaprograms;

public class DevideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(0/0);//Arithmatic Exception
		System.out.println(12.0/0);//Infinity
		System.out.println(12.0f/0);///Infinity
		System.out.println(12.0f/0.0);//Infinity
		System.out.println(12/0.0);//Infinity
		System.out.println(12.999d/0);//Infinity
		System.out.println(0.0/0);//NaN
		System.out.println(0.0/0.0);//NaN
		System.out.println(12.99/0.0);//Infinity
	}

}
