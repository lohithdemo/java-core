package learning.java.core.day1;

/**
 * Reverse a String
 * @author Lohith.Samaga
 *
 */
public class ReverseString {

	public ReverseString() {
		
	}
	
	public String reverseString(String strIn) {
		String strOut = "";
		int len = strIn.length();
		for (int i = len - 1; i >= 0; i--) {
			strOut += strIn.substring(i, i + 1);
		}
		
		return strOut;
	}
	
	public static void main(String[] args) {
		
		ReverseString r = new ReverseString();
		System.out.println(r.reverseString("Hi!"));
		System.out.println("How are you?");
	}
	
 }
