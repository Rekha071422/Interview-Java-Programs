package InterviewJavaprograms.InterviewJavaprograms;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int n=3,flag=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("Non prime Number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Prime Number");
		}
		
		
	}
	
	}

