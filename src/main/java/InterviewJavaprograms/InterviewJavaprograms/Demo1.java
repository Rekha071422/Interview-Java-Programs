package InterviewJavaprograms.InterviewJavaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		// 
    String str="TODO Auto-generated method stub";
    
    char ch[]=str.toCharArray();
    HashMap<Character,Integer> dataMap=new HashMap<Character,Integer>();
    for(char ch1:ch)
    {
    	if(dataMap.containsKey(ch1))
    	{
    		dataMap.put(ch1, dataMap.get(ch1)+1);
    		
    	}
    	else
    	{
    		dataMap.put(ch1,1);
    	}
    }
    
    System.out.println(dataMap.toString());
    


 }
	
	

}
