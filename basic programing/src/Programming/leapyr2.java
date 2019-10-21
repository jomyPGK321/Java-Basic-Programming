package Programming;
import java.util.Scanner;
public class leapyr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Year");
		int y=s.nextInt();
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					System.out.println("Leap Year");
				}
		else			
						System.out.println("Not a Leap Year");

				}
		else
		{
			System.out.println("Leap Year");
			}
		}
		else
		{
			System.out.println("Not a Leap Year");
	
			
			
		}
		
		s.close();
	}

}
