package TrickyInterviewPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateString {

	//BruteForce
	//Hashset
	//HashSet
	//Streams
	
	String str[]= {"Rekha","Anaya","Om","Pihu","Pihu","Pramod"};
	
	//Using HashSet
	public void duplicateElementsUsingHashSet()
	{
		HashSet<String> data=new HashSet<String>();
		for(String e:str)
		{
			if(data.add(e)==false)
			{
				System.out.println(e);
			}
		}
	}
	
	//Using BruteForce
	public void duplicateElementUsingBruteForce()
	{
		for(int i=1;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println(str[i]);
				}
			}
		}
	}
	
	//Using HashMap<K,V>
	public void duplicateElementusingHashMap()
	{
		Map<String, Integer> data=new HashMap<String, Integer>();
		for(String e:str)
		{
			Integer count=data.get(e);
			if(count==null)
				data.put(e,1);
			else
				data.put(e, ++count);
		}
		
		Set<Entry<String,Integer>> entrySet=data.entrySet();
		for(Entry<String,Integer> entrydata:entrySet)
		{
			if(entrydata.getValue()>1)
				System.out.println(entrydata.getKey());
			
		
	   }
  }
	
	/*public void duplicateElementUsingStreams()
	{
		Set<String> data=new HashSet<String>() ;
		Set<String> dupData=Arrays.asList(str).stream().filter(e -> !data.add(e)).collect(Collectors.toSet());
		System.out.println(dupData);
				
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDuplicateString fs=new FindDuplicateString();
		fs.duplicateElementsUsingHashSet();
		fs.duplicateElementUsingBruteForce();
		fs.duplicateElementusingHashMap();
	}

}
