package learning.java.core.day1;

import java.util.Scanner;

public class D01p01 {
	public static void main(String[] args) {
		System.out.println("001");
		Scanner x = new Scanner(System.in);
		System.out.println("002");
		float l, b;
		System.out.println("003");
		l = x.nextFloat();
		System.out.println("004");
		b = x.nextFloat();
		System.out.println("005");
		Rectangle r1 = new Rectangle(l, b);
		System.out.println("006");
		r1.calculateArea();
		System.out.println("007");
		
		x.close();
	}

}
