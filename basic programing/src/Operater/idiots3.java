package Operater;
import java.util.Scanner;
public class idiots3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the x1 value");
		float x1=s.nextFloat();
		System.out.println("Enter the y1 value");
		float y1=s.nextFloat();								
		System.out.println("Enter the x2 value");
		float x2=s.nextFloat();
		System.out.println("Enter the y2 value");
		float y2=s.nextFloat();
		float x=(x1+x2)/2;
		float y=(y1+y2)/2;
		System.out.printf("midpoint is   %.02f     %.02f ",+x,y);
		
		
	}

}
