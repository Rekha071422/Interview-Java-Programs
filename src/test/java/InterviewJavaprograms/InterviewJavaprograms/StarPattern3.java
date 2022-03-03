package InterviewJavaprograms.InterviewJavaprograms;

public class StarPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=4;i++)
		{
			for (int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=(i*2)-1;k++)
			{
				System.out.print("*");

			}
		System.out.println();
		}
	}

}
