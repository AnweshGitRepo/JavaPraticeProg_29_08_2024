package javaProg;

public class CountTheVowelFromString {
	static int count=0;
	
	public static void main(String[] args) {
		
		
		String str="my name is lakahan";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
