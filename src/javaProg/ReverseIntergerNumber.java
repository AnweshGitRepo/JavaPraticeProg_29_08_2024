package javaProg;

public class ReverseIntergerNumber {

	
	
	public static void main(String[] args) {
		
		int number=45678;
		int rev=0;
		
		while(number!=0) {
			
			int reminder=number%10;
			System.out.println(" remender = "+reminder);
			System.out.println("Before Reverse = "+rev);
			rev=rev*10+reminder;
			System.out.println("After Reverse = "+rev);
			System.out.println("Before Number = "+number);
			number=number/10;
			System.out.println("After Number = "+number);
			System.out.println("******************");
		}
		
	}
}
