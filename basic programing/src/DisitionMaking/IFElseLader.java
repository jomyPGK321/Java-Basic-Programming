package DisitionMaking;
import java.util.Scanner;
public class IFElseLader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>=50 & a<=80)
		{
			System.out.println("old Gen");
		}
		else if(a>=30 & a<=49)
		{
			System.out.println("Midle age Gen");	
		}
		else if(a>=20 & a<=29)
		{
			System.out.println("Young Gen");		
		}
		else if(a>=13 & a<=19)
		{
			System.out.println("Teen Age Gen");		
		}
		
		else 
		{
			System.out.println("Kids");		
		}
	}

}
