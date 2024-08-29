package javaProg;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacterRepetitionInAString2 {

	public static void main(String[] args) {
		

		
		String str="anweshshrikhande";
	    String newStr=str.replaceAll(" ", "");
		
		char ch[]=str.toCharArray();
		int count=0;
		
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<ch.length;i++) {
			count=0;
			
			for(int j=0;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			map.put(ch[i], count);
		}
		System.out.println(map);
	}

}
