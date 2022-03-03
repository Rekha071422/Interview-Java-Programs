package InterviewJavaprograms.InterviewJavaprograms;

public class Print1To100NumberWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber(1);
		printNum(1, 100);
		
	}
	public static void printNumber(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNumber(num);
		}
	}
	
	public static void printNum(int stNum,int enNum)
	{
		if(stNum<=enNum)
		{
			System.out.println(stNum);
			stNum++;
			printNum(stNum, enNum);
			
		}
			
	}

	
}
