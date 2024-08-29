package javaProg;

public class ArmstrongNumberProgram {
public static void main(String[] args) {
	
	int digit= 407;
	
	int total = 0, temp, number;
	
	number=digit;
	
  while(number>0) {
	  
	 temp=number%10;
//	 System.out.println("temp * "+temp);
	 total=total+temp*temp*temp;
//	 System.out.println("Total ** "+total);
	 number=number/10;
//	 System.out.println("number *** "+number);
	 
  }
  if(total==digit) {
	  System.out.println(digit+" this is Amstrong Number");
  }
  else {
	  System.out.println(digit+" this is not Amstrong Number");
  }
//  System.out.println(total);
	
	
}
}
