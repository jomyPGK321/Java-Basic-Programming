package Presentation;

import java.util.Scanner;

public class prime_no {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i, c = 0;
		for (i = 2; i <= a / 2; i++) {
			if (a % i != 0) {
				c = 1;
			} else {
				c = 0;
			}
		}
		if (c == 1) {
			System.out.println("It is a Prime number");
		} else {
			System.out.println("It is not a Prime number");
		}
	}
}
