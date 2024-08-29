package javaProg;

public class CountTotalNumberOFWordInString {
public static void main(String[] args) {
	
	
	String s="my name is hero";
	int count=1;
	
	for(int i=0;i<s.length()-1;i++) {
		
		if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
			count++;
		}
		
	}
	System.out.println("'"+s+"' total number of word is = "+count);
	
	
}
}
