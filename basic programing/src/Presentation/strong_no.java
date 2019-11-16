package Presentation;

import java.util.Scanner;

public class strong_no {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=n;
		int m;
		int f;
		int i;
		int sm=0;
		while(n!=0)
		{
		f=1;
		m=n%10;
		for(i=1;i<=m;i++)
		{
		f=f*i;
		}
		sm=sm+f;
		n=n/10;
		}
		if(sm==a)
		System.out.print("It is a Prime Number");
		else
		System.out.print("It is Not a Prime Number");
		}
           
	}

