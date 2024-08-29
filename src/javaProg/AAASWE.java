package javaProg;

import java.util.HashMap;
import java.util.Map;

public class AAASWE {
	
	public String clearmethod(String no) {
		
		//int number=Integer.parseInt(no);  
		if(no.length()==9) {
			return "Number is cleared 9 Digit";
		}
		return "Number is not 9 digits";
		
	}
	
	
public static void main(String[] args) {
	AAASWE ab=new AAASWE();
	String str="123-456-789";
	
	String newStr=str.replaceAll("-", "");
	System.out.println(newStr);
	System.out.println(ab.clearmethod(newStr));
	
	
	
	
	
	
	
}
}
