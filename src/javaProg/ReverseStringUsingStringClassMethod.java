package javaProg;

public class ReverseStringUsingStringClassMethod {

	public static void main(String[] args) {
		String str="hellowword";
	StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		
	System.out.println(sb);	
	}
	
}
