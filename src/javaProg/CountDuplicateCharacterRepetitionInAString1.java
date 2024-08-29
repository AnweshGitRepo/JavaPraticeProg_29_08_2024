package javaProg;

public class CountDuplicateCharacterRepetitionInAString1 {
	// Character Occurrence
public static void main(String[] args) {

	String str="kaialass";
	char ch[]=str.toCharArray();
	int count=0;
	for(int i=0;i<str.length();i++) {
		
		count=1;
		for(int j=i+1;j<str.length();j++) {
			if(ch[i]==ch[j] && ch[j]!='0') {
				count++;
				ch[j]='0';
				
			}
		}
		if(count>1 && ch[i]!='0')
			System.out.print(ch[i]+" = "+count+", ");
	}
	
	
	
}
}
