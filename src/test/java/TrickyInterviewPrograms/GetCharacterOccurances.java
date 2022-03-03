package TrickyInterviewPrograms;

public class GetCharacterOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCharacterOccurance("RekhaPramod",'a');
		String str2="RekhaPramod";
		
		//Using String Utils Apache
		/*int count=StringUtils.countMatches(str2,'a');
		System.out.println(count);*/
	}
	
	public static void getCharacterOccurance(String str,char val)
	{

		int count=0;
		for(char ch:str.toCharArray())
		{
			if(ch==val)
			{
				count++;
			}
		}
		System.out.println(val+":"+count);
	}

}
