package javaProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConcatenateCharactersFromEachString {

	/*Input String arr[] = {"Rama", "Test", "Type", "Tata"}
	   Output should be  - "RTTTaeyamsptatea" */
	public static void main(String[] args) {
	String arr[]={"Rama","Tours","Travel","Company"};
	System.out.println("User Input = "+Arrays.toString(arr));
	LinkedHashMap<Integer, ArrayList<String>> map= new LinkedHashMap<>();
	String ans="";
	for (int i = 0; i<=arr.length-1; i++) {
		String word= arr[i];
	//	System.out.println("*****  "+word);
		for (int j = 0; j <=word.length()-1; j++) {
            ArrayList<String> list= new ArrayList<>();
            if(map.containsKey(j))
            {
            	ArrayList<String> list1= map.get(j);
                list1.add(String.valueOf(word.charAt(j)));
            //    System.out.println("List 1 = "+list1);
                map.put(j, list1);      
             //   System.out.println("LHMap  = "+map);
             }
             else {
                list.add(String.valueOf(word.charAt(j)));
              //  System.out.println("list "+list);
                map.put(j, list);
              //  System.out.println("LHMap  = "+map);
             }
          }
       }
	
	//System.out.println("LHMap  = "+map);
       for(Map.Entry<Integer, ArrayList<String>> e:map.entrySet())
       {
         //  System.out.println(e.getKey()+" " +e.getValue());
          ArrayList<String> l1= e.getValue();
          for (int i = 0; i <=l1.size()-1; i++) {
             ans=ans+l1.get(i);
          }
       }
       System.out.println("Expected Output Is: "+ans);
    }
}
