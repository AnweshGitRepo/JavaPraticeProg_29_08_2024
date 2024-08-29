package javaProg;

public class FirstLetterIsCapitalProgram {
public static void main(String[] args) {
	String s="my name is lakahn and i am good";
	
	String world[]=s.split(" ");
	
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<=world.length-1;i++) {	
	sb.append(Character.toUpperCase(world[i].charAt(0)));
	//System.out.println(" == "+sb);
	sb.append(world[i].substring(1)).append(" ");
	//System.out.println("** == "+sb);
	}
	System.out.println(sb);
}
}
