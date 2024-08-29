package javaProg;

public class ReplaceTheCharacterUsingReplaceAllMethod {

	
	public static void main(String[] args) {
		
		String str="welcome to java world";
		
		str=str.replaceAll("[AaEeIiOoUu]", "*");
		System.out.println(str);	
	}
}
