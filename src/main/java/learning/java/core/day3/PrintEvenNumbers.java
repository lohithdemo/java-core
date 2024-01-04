package learning.java.core.day3;

/**
 * Print  even numbers
 * 
 * @author Lohith.Samaga
 *
 */
public class PrintEvenNumbers {

	public PrintEvenNumbers() {
		
	}
	
	public void printEvenNumbers(int start, int end) {
		for(int i = start; i <= end; i++) {
			if (i %2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		PrintEvenNumbers p = new PrintEvenNumbers();
		p.printEvenNumbers(10, 20);
	}
	
 }
