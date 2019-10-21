package arrays;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	      int r=s.nextInt();
	      int c=s.nextInt();
	       int n=s.nextInt();
	      if(n<=r||(n-1)%r==0||n%c==0)
	      {
	        System.out.println("Yes");
	      }
	      else
	      {
	         System.out.println("No");
		
	      }

	}

}
