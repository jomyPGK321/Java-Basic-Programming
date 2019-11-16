package Presentation;

import java.util.Scanner;

public class Area_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius");
		double r=s.nextInt();
		double pi=3.14;
		double area=pi*(r*r);
		System.out.println(area);
	}

}
