package arrays;
import java.util.Scanner;
public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st array");
		int a=s.nextInt();
		int sm=0;
		int sm1=0;
		int e=0;
		int o=0;
		int b=0;
		int c=0;
		int ev=0;
		int od=0;
		int [] A=new int[a];
		int [] n=new int[a];
		int [] m=new int[a];
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter the 1st values");
			A[i]=s.nextInt();
			if(A[i]%2==0)
			{
				sm=sm+A[i];
				b++;
				n[i]=A[i];
			}
			else
			{
				sm1=sm1+A[i];
				c++;
				m[i]=A[i];
			}
		}
		for (int i=0;i<a;i++)
		{	
		System.out.println("Sum of odd numbers" +m[i]);
		System.out.println("Sum of even numbers" +n[i]);
		}
		System.out.println("Sum of even numbers" +sm);
		System.out.println("Sum of even numbers" +sm1);
		System.out.println("Sum of even numbers" +sm/b);
		System.out.println("Sum of even numbers" +sm/c);



	}

}
