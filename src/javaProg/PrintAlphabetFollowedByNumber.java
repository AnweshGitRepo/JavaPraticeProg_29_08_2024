package javaProg;

public class PrintAlphabetFollowedByNumber {
public static void main(String[] args) {
	int count=0;

	for(int i='A';i<='z';i++) {
		count++;
		System.out.print((char)i+""+count+" ");
	}
}
}
