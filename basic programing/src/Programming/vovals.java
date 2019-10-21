package Programming;
import java.util.Scanner;
public class vovals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st array");
		int a=s.nextInt();
		int i=0;
		char c;
		String[]A=new String[a];
		for( i=0;i<a;i++)
		{
			System.out.println("Enter the Values");
			A[i]=s.next();			
		}
		for( i=0;i<a;i++)
		{
			c=A[i].charAt(0);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
			{
				System.out.println(A[i]);
			}
		}s.close();
	}

}
