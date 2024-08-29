package javaProg;

public class ReverseString1Program {

	
	public static void main(String[] args) {
		String str="hello@world1";
		
		String newStr=str.replaceAll("[@1]","");
		String str1="";
		
		for(int i=newStr.length()-1;i>=0;i--) {
			
			str1=str1+newStr.charAt(i);
		}
		
		System.out.println(str1);
	}
	}

