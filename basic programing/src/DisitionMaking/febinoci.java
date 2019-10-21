package DisitionMaking;
import java.util.Scanner;
public class febinoci {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int a=0,b=1;
		System.out.printf("%d %d ",a,b);
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			System.out.printf("%d",c);
			a=b;
			b=c;
			
		} 
			

	}

}
