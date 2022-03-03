package InterviewJavaprograms.InterviewJavaprograms;

public class FingMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a=1,2,3,,56...100
		int num[]= {1,2,3,4,5,7};
		int n1=findMissingNumber(num,7);
		System.out.println(n1);
	}
	
	public static int findMissingNumber(int num[],int totalcount)
	{
		int expVal=totalcount*((totalcount+1)/2);
		int actualVal=0;
		for(int i:num)
		{
			actualVal+=i;
			
		}
		return expVal-actualVal;
	}

}
