package DisitionMaking;
import java.util.Scanner;
public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your lower limit");
		int i;
		int n=s.nextInt();
		System.out.println("Choose your higher limit");
		int m=s.nextInt();
		int sm=0;
		for(i=n;i<=m;i++)
		{
			sm=sm+i;
			
		}
		System.out.println(sm);
	}

}
