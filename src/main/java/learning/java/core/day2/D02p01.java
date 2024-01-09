package learning.java.core.day2;

import java.util.Scanner;

public class D02p01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);

		if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
			System.out.println("Character is an Alphabet");
		} else if (ch >= 48 && ch <= 57) {
			System.out.println("Character is a Digit");
		} else {
			System.out.println("It is a Special Character");
		}
		input.close();
	}
}
