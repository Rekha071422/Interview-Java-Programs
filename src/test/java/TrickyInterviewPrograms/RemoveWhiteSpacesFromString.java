package TrickyInterviewPrograms;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" This is Java Programming";
		String newStr=" This is Java Programming";
		System.out.println(str.replaceAll("\\s", ""));
		String NoWhiteSpace="";
		
		 
		 for(int i=0;i<newStr.length();i++)
		 {
			 if((newStr.charAt(i)!=' '))
			 {
				 NoWhiteSpace=NoWhiteSpace+newStr.charAt(i);
			 }
			 

		 }
		 System.out.println(NoWhiteSpace);

	}

}
