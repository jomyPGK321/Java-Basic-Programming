package DisitionMaking;
import java.util.Scanner;
public class Fallthrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int n=s.nextInt();
		int r=n%10;
		int c=n/10;
		int t=0;
		if (c!=1)
		{
			switch(r)
			{
			case 1:
			case 2:
			case 6: t=t+3;
			break;
			case 4:
			case 5:
			case 9: t=t+4;
			break;
			case 3:
			case 7:
			case 8: t=t+5;
			break;
			}
			switch(c)
			{
			case 9:
			case 8:
			case 4:
			case 2:
			case 3: t=t+6;
			break;
			case 5: t=t+5;
			break;
			case 7: t=t+7;
			}
		}
	else
	{
		switch(r)
		{
				case 0: t=t+3;
				break;
				case 1:
				case 2: t=t+6;
				break;
				case 3:
				case 4:
				case 8:
				case 9: t=t+8;
				break;
				case 5:
				case 6: t=t+7;
				break;
				case 7: t=t+9;
				break;
				default:
					System.out.println("no number");
		}
					
			}
		
		System.out.println(t);

	}

}
