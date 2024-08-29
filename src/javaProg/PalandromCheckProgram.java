package javaProg;

public class PalandromCheckProgram {

	public static void main(String[] args) {
		
		String str="POA";
		
		String s="";
		
		for(int ch=str.length()-1;ch>=0;ch--) {
			
			s=s+str.charAt(ch);
		}
		if(s.equals(str)) {
		System.out.println("String is palandrom");
		}else
		System.out.println("String is not palandrom");
		
		
	}
	
	
	
}
