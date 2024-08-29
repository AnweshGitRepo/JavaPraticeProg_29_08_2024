package javaProg;

public class Tribonnacci_Series {

	public static void main(String[] args) {
		
		
		int n=10;
		int x=0,y=1,z=2;
		
		
		for(int num=0;num<n;num++) {
			System.out.print(" + "+x);
			int number=x+y+z;
			          x=y;
			          y=z;
			          z=number;
			        		  
		}
	}
	
}
