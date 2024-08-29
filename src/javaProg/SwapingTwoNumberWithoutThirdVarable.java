package javaProg;

public class SwapingTwoNumberWithoutThirdVarable {

	
	public static void main(String[] args) {
		
		int x=20;
		int y=40;
		System.out.println("Before swaping  x = "+x+" ,  y = "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swaping  x = "+x+" ,  y = "+y);
		
		
	}
}
