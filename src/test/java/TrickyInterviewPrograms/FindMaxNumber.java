package TrickyInterviewPrograms;

public class FindMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {10,20,89,67,88,456};
		int maxNum=Integer.MIN_VALUE;
		for(int element:num)
		{
			if(maxNum<element)
			{
				maxNum=element;
			}
		}
		System.out.println(maxNum);
	}

}
