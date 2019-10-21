package Programming;
import java.util.Scanner;
public class Strongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
		int a=n;
		int m;
		int f;
		int r;
		int i;
		int sm=0;
		int num=n;
		while(n!=0)
		{
			f=1;	
		r=n%10;	
		for (i=1;i<=r;i++)
		{
			f=f*i;
		}
		sm=sm+f;
		n=n/10;
		}
		if (sm==a)
		System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
		

	}

}
