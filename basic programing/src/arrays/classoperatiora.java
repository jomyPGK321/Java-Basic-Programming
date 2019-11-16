package arrays;

import java.util.Scanner;

public class classoperatiora {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
			System.out.println("Enter the number 1");
			int n1=s.nextInt();
			System.out.println("Enter the number 2");
			int n2=s.nextInt();
			System.out.printf("1)add\n2)sub\n3)mul\n4)div\n5)mod\n");
			int n=s.nextInt();
			Operation c = new Operation(n1,n2);
			switch(n)
			{
				case 1:
					Operation.add(n1,n2);
					break;
				case 2:
					Operation.sub(n1,n2);
					break;
				case 3:
					Operation.mul(n1,n2);
					break;
				case 4:
					Operation.div(n1,n2);
					break;
				case 5:
					Operation.mod(n1,n2);
					break;
			}
	}
}

		class Operation(int n1 , int n2)
		{
			int n1,n2;
			public Operation(int n1, int n2)
			{
			n1=n1;
			n2=n2;
			}
			public static void(int n1,int n2)
			{
				System.out.printf("Add-> %d,"n1+n2);
			}
			public static void(int n1,int n2)
			{
				System.out.printf("Sub-> %d,"n1-n2);
			}
			public static void(int n1,int n2)
			{
				System.out.printf("Mul-> %d,"n1*n2);
			}
			public static void(int n1,int n2)
			{
				System.out.printf("Div-> %d,"n1/n2);
			}
			public static void(int n1,int n2)
			{
				System.out.printf("Mod-> %d,"n1%n2);
			}
			
			}
		}