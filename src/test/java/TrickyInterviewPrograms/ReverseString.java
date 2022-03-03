package TrickyInterviewPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseString("Anaya");
		usingStringBuffer("Anya");
	}
	
	public static void reverseString(String str)
	{
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);

		}
		System.out.println(rev);

	}
	
	public static void usingStringBuffer(String str)
	{
		StringBuffer sf=new StringBuffer(str);
		StringBuffer rev=sf.reverse();
		System.out.println(rev);
		
	}
	

}
