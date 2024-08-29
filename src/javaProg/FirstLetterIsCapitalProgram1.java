package javaProg;

public class FirstLetterIsCapitalProgram1 {

	public static void main(String[] args) {
		String is="welcome To java program";

		String [] world=is.split(" ");
		
		for(String word:world) {
			
		System.out.print(word.substring(0,1).toUpperCase()+word.substring(1)+" ");
		}
	}
}
