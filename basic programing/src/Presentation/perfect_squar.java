package Presentation;

import java.util.Scanner;

public class perfect_squar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		double b = (int) Math.sqrt(a);
		if ((b * b) == a) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
