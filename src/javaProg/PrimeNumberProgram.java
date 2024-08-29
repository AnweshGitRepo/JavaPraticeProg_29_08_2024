package javaProg;

public class PrimeNumberProgram {
	public static void main(String[] args) {
	 for(int i=2;i<=100;i++) {
		int temp=1;
		for(int j=2;j<=i;j++) { 
			String numberStr = Integer.toString(j);
			if(i%j==0 && !numberStr.contains("3") && !numberStr.contains("7")) {			
				temp++;
			}
		}
		if(temp==2 ) {	
		System.out.print(" "+i);
		}
	  }	
    }
}
