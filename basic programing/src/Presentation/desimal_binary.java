package Presentation;

import java.util.Scanner;

public class desimal_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,count=0,a;
		String x="";
		System.out.println("Enter any Decimal number :");
		n=s.nextInt();
		while(n>0)
		{
			a=n%2;
			x=a+x;
			n=n/2;
			
		}
		System.out.println("Binary Number :"+x);
	}

}
