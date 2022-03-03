package TrickyInterviewPrograms;

public class FindMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {10,22,10,34,45,56};
		int minNum=Integer.MAX_VALUE;
		for(int element:num)
		{
			
			if(minNum>element)
			{
				minNum=element;
			}
		}
		System.out.println(minNum);
	}

}
