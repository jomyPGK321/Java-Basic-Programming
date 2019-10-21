package Programming;
import java.util.Scanner;
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The First Number:");
		int a=s.nextInt();
		System.out.println("Enter The Second Number:");
		int b=s.nextInt();
		int gcd;
		int min=(a<b)?a:b;
		int i;
		for (i=min;i>0;i--)
		{
		   if ((a%i==0)&&(b%i==0))
		   {
		   gcd=i;
		System.out.printf("%d",+ gcd);
		break;
		   }
		   
		}s.close();
          
	}

}

