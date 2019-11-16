package Presentation;

import java.util.Scanner;

public class length_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.next();
		int b=a.length();
		System.out.println(b);
		sc.close();
	}

}
