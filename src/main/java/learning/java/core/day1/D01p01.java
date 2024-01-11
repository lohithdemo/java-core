package learning.java.core.day1;

import java.util.Scanner;

public class D01p01 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		float l;
		float b;
		l = x.nextFloat();
		b = x.nextFloat();
		Rectangle r1 = new Rectangle(l, b);
		r1.calculateArea();
		
		x.close();
	}

}
