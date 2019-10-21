package Operater;
import java.util.Scanner;
public class simbleintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("principle amound");
		Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        System.out.println("Year");
        int n=s.nextInt();
        System.out.println("Intrest");
        float i=s.nextFloat();
        float r=(p*n*i)/100;
        System.out.println("Simble intrest="+r);
	}

}
