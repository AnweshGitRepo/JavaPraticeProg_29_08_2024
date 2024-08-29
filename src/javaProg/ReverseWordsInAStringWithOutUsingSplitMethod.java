package javaProg;

public class ReverseWordsInAStringWithOutUsingSplitMethod {

	public static void main(String[] args) {
		
		String str="I love my country";
		
		int i=str.length()-1;
		int start,end=i+1;
		String result="";
		while(i>=0) {
			if(str.charAt(i)==' ') {
				start=i+1;
				while(start!=end) 
				result+=str.charAt(start++);
				result+=" ";
				end=i;
			}
			i--;
		}
		start=0;
		while(start!=end) {
			result+=str.charAt(start++);
			System.out.println(result);
		}
	}
}
