package Presentation;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
double dec = 0;
int p =  0;
while(n!=0) 
{
	int a=n%10;
	dec=dec+a*(Math.pow(2, p));
	n=n/10;
	p++;
	
}
System.out.println(dec);

	}

}
z