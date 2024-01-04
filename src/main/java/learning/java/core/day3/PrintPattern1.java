package learning.java.core.day3;

import java.util.Scanner;

/**
 * Given a word PROGEAM, print as below
 * P
 * R O
 * G R A
 * M P R O
 * G R A M P
 * R O G R A M
 *  
 * @author Lohith.Samaga
 *
 */
public class PrintPattern1 {

	public PrintPattern1() {
		
	}
	
	public void printPattern(String input) {
		int l = input.length();
		int lineCount = l;
			if (lineCount % 2 == 0) {
				lineCount *= 2;
			}
		int absolute_seq = 0;
		int current_seq = 0;
		for (int i = 0; i < lineCount; i++) {
			String s = "";
			boolean begin = true;
			for (int j = 0; j <= i; j++) {
				current_seq = absolute_seq++ % l;
				if (begin) {					
					s += input.substring(current_seq, current_seq + 1);
					begin = false;
				} else {
					s += " " + input.substring(current_seq, current_seq + 1);
				}
			}
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		PrintPattern1 p = new PrintPattern1();
		p.printPattern("PROGRAMS");
	}
	
 }
