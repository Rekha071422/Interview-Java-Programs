package TrickyInterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateCharUsingMap("RekhaPramod");
	}
	
	public static String duplicateCharUsingMap(String str)
	{
		if(str==null)
		{
			System.out.println("Null String");
			return str;
		}
		
		if(str.isEmpty())
		{
			System.out.println("Empty String");
			return str;
		}
		
		if(str.length()<1)
		{
			System.out.println("Single Char String");
			return str;
		}
		
		
		char words[]=str.toCharArray();
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		for(char ch:words)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
				charMap.put(ch, 1);
		}
		
		//Print the Duplicate Char
		
		Set<Map.Entry<Character, Integer>> entrySet=charMap.entrySet();
		for(Map.Entry<Character, Integer> dupchar:entrySet)
		{
			if(dupchar.getKey()>1)
			{
				System.out.println(dupchar);
			}
				
		}
				return str;
		}

}
