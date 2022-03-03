package InterviewJavaprograms.InterviewJavaprograms;

public class NaNNumber {

	//NaN means Not a Number Number Not defined
	
	public static void main(String args[])
	{
		System.out.println(0.0/0.0); //NaN
		System.out.println(2.0/2.0);  //1.0 
		System.out.println(Math.sqrt(-1)); //NaN
		
		System.out.println(Float.NaN==Float.NaN); //it will return true or false, both NaN comparision will give Flase result 
		System.out.println(Float.NaN!=Float.NaN);// True

		Double nan=2.0/1;
		System.out.println(Double.NaN==nan);//false
		System.out.println((2.0/1)==nan);//true

	}
	
}
