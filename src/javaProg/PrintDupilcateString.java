package javaProg;

public class PrintDupilcateString {

	public static void main(String[] args) {
		String str="Stringstrrr";
		char[] inp=str.toCharArray();
		System.out.println("Duplicate character are :");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(inp[i]==inp[j]) {
					System.out.println(inp[j]);
				}
			}
		}
	}
}
