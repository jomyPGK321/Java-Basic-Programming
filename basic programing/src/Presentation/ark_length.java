package Presentation;                                                                                                        

import java.util.Scanner;

public class ark_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		  double r=s.nextDouble();
		  double c=s.nextDouble();
		  double a;
		  a = 2 * 3.14 * r * (c/360);
		  System.out.println("Arc Length = "+a);
	}

}
