package javaProg;

public class RemoveSpaceFromString {
	public static void main(String[] args) {
	
		String abc="hellow world my name";
		String newstr=abc.replaceAll("\\s","");
		System.out.println(newstr);
		
		/***********************************************/
		// Second method using without replaceall mothod
		String abcd="Hello world new images";
		char ch[]=abcd.toCharArray();
		
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < ch.length; i++)
	      {
	         if( (ch[i] != ' ') && (ch[i] != '\t') )
	         {
	            sb.append(ch[i]);
	         }
	      }
		System.out.println("After Remove The Space :- "+sb);
	}
}
