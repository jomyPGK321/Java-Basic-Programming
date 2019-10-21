package Programming;
import java.util.Scanner;
public class LCMno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The First Number:");
		int a=s.nextInt();
		System.out.println("Enter The Second Number:");
		int b=s.nextInt();
		int lcm;
		int max=(a>b)?a:b;
		int i;
		for (i=max;i<=(a*b);i++)
		{
		   if ((i%a==0)&&(i%b==0))
		   {
		   lcm=i;
		System.out.printf("%d",+ lcm);
		break;
		   }
		   
		}s.close();
	}
	

}
