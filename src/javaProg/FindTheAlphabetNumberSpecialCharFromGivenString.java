package javaProg;

public class FindTheAlphabetNumberSpecialCharFromGivenString {
public static void main(String[] args) {
	
	String str="how are you!@1236";
	StringBuilder numeric=new StringBuilder();
	StringBuilder Alpha=new StringBuilder();
	StringBuilder special=new StringBuilder();
	String d,a,s;
	/*Character Array*/
//	char speciasl = 0,aplpha = 0,num = 0;
	
	
	for(int i=0;i<str.length();i++) {
		
		
			if(Character.isDigit(str.charAt(i))) {
				numeric.append(str.charAt(i));
				//num=str.charAt(i);
		}else if(Character.isAlphabetic(str.charAt(i))) {
			Alpha.append(str.charAt(i));
			//aplpha=str.charAt(i);
		}else {
			special.append(str.charAt(i));
			//speciasl=str.charAt(i);
		}	
	}
	
	System.out.println("Numeric Value : "+numeric);
	System.out.println("Alphabetic Value : "+Alpha);
	System.out.println("Special : "+special);
	
//	System.out.println("Numeric Value : "+num);
//	System.out.println("Alphabetic Value : "+aplpha);
//	System.out.println("Special : "+speciasl);
}
}
