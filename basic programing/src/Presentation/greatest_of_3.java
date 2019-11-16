package Presentation;

import java.util.Scanner;

public class greatest_of_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		if(n1>n2 && n1>n3)
		{
		System.out.print("Biggest no number"+n1);
		}
		else if(n2>n1 && n2>n3)
		{
		System.out.println("Biggest no number"+n2);
		}
		else
		{
		System.out.println("Biggest no number"+n3);
		}

	}

}
