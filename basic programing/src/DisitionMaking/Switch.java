package DisitionMaking;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter a Value");
		char branch=s.next().charAt(0);
		int collegeyear=s.nextInt();
		switch (collegeyear)
		{
		case 1:
			System.out.println("English,Maths and Science");
			break;
		case 2:
			switch(branch)
			{
			case 'c':
			System.out.println("OS,JAVA,PHP");
			break;
			case 'e':
				System.out.println("Physics,Logic Swiching");
				break;
			case 'm':
				System.out.println("Drawing,Manufacturing");
				break;
				default:
					System.out.println("Not Defined");
					break;
			}
			break;
		case 3:
			switch(branch)
			{
			case 'c':
				System.out.println("CS,ES");
				break;
				case 'e':
					System.out.println("Malayalam,Social");
					break;
				case 'm':
					System.out.println("SE,Engine Defining");
					break;
					default:
						System.out.println("Not Defined");
						break;
			}
			
			
		}
		


	}

}
