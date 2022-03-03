package InterviewJavaprograms.InterviewJavaprograms;

import java.util.Arrays;
import java.util.BitSet;

public class Print1To100WithoutLoopRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object num[]=new Object[100];
		Arrays.fill(num, new Object()
		{
		int count=0;
		@Override
		public String toString()
		{
			return Integer.toString(++count);
		}
		});
		System.out.println(Arrays.toString(num));
	}
	
	//BitSet
	String set=new BitSet(){{set(1,100);}}.toString();
	//System.out.append(set,1,set.length());

}
