package javaProg;

public class ReverseWordsInAString {
	public static void main(String[] args) {
	String str="i love my india";
    String newStr[]=str.split(" ");
    String revStr="";
    
    for(int i=newStr.length-1;i>=0;i--) {
 
    	
    	revStr=revStr+newStr[i]+" ";
    	
    }
	System.out.println(revStr);
	
	}
}
