package javaProg;

public class AdditionOfNumbersInAGivenString {
public static void main(String[] args) {
	String str="my name268is Anwesh ";
	
	int sum=0;
	for(int i=0;i<str.length();i++) {
		
		if(Character.isDigit(str.charAt(i))) {
			//System.out.println(str.charAt(i));
			sum=sum+Character.getNumericValue(str.charAt(i));
		}
	}
	System.out.println("Sum of the Numbers = "+sum);
}
}
