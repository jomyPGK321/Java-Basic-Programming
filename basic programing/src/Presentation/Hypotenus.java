package Presentation;

import java.util.Scanner;

public class Hypotenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base length");
		double a = s.nextDouble();
		System.out.println("Enter the Altitude length");
		double b = s.nextDouble();
		double h = (a * a) + (b * b);
		double hy = Math.sqrt(h);
		System.out.printf("Hypotenus is %.2f", hy);
	}

}
