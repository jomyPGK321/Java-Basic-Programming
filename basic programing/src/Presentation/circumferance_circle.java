package Presentation;

import java.util.Scanner;

public class circumferance_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int radius=s.nextInt();
		double circumference;
		circumference = Math.PI*2*radius;
		System.out.println(circumference);
	}

}
 