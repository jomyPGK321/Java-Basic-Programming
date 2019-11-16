package Presentation;
import java.util.Scanner;
public class Amstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = a;
		int c = a;
		int count = 0, r, sum = 0;
		while (c != 0) {
			count++;
			c = c / 10;
		} 
		while (a != 0) {
			r = a % 10;
			sum = (int) ((int) (double) sum + Math.pow(r, count));
			a = a / 10;
		}
		System.out.println(sum);
		if (sum == b) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not Amstrong");
		}
	}
}
