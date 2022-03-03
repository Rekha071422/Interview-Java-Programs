package TrickyInterviewPrograms;
/*
 * What is the value of double min value?
 * Which one is bigger-->Double Min_Value or 0.0d?
 * Which one is bigger-->Double Min_value or NEGATIVE_INFINITY Value?
 * 
 */
public class DoubleMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Double.MIN_VALUE);//+ve Number
		System.out.println(Long.MIN_VALUE);//-ve Number
		System.out.println(Integer.MIN_VALUE);//-ve Number
		System.out.println(Float.MIN_VALUE);//+ve Number
		System.out.println(Math.min(Long.MIN_VALUE,0.0));//-ve Number
		System.out.println(Math.min(Double.MIN_VALUE,0.0));//+ve Number
		System.out.println(Math.min(Float.MIN_VALUE,0.0f));//+ve Number
		System.out.println(Math.min(Integer.MIN_VALUE,0.0));//-ve Number
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));//Double.NEGATIVE_INFINITY

	}

}
