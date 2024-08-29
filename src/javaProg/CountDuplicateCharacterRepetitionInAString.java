package javaProg;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacterRepetitionInAString {

	public static void main(String[] args) {
		String s = "Howh arhe youh";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);
		  if (map.containsKey(c)) {
		    int cnt = map.get(c);
		    System.out.println("cnt "+cnt);
		    map.put(c, ++cnt);
		   
		  } else {
		    map.put(c, 1);
		  }
		}
		System.out.println(map);
	}
}
