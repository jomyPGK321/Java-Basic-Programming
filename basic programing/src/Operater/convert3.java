package Operater;
import java.util.Scanner;
public class convert3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=253,b,c,d,e,f;
		b=a%10;
		c=a/100;
		d=b*b;
		e=b*c;
		System.out.printf("%d%d\n",d,e);
		f=d*e;
		System.out.println(f);
		
		
		

	}

}
