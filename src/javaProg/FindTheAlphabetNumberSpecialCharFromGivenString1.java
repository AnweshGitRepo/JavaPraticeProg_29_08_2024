package javaProg;

public class FindTheAlphabetNumberSpecialCharFromGivenString1 {
public static void main(String[] args) {
	 String str = "how are you!@1236";
     StringBuilder digits = new StringBuilder();
     StringBuilder alphabets = new StringBuilder();
     StringBuilder specialChars = new StringBuilder();

     for (char c : str.toCharArray()) {
         if (Character.isDigit(c)) {
             digits.append(c);
            
         } else if (Character.isAlphabetic(c)) {
             alphabets.append(c);
         } else {
             specialChars.append(c);
         }
     }
     System.out.println("Digits : " + digits.toString());
     System.out.println("Alphabets : " + alphabets.toString());
     System.out.println("Special Characters : " + specialChars.toString());
 }
}
