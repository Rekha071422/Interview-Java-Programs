package InterviewJavaprograms.InterviewJavaprograms;

import java.util.HashSet;

public class DuplicateArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strArray[]= {"sd","re","er","er","re"};
		//using Hashset
		HashSet<String> str=new HashSet<String>();
		for (String array:strArray)
		{
			if(str.add(array)==false)
			{
				System.out.println(array);
			}
		}
		
	}

}
