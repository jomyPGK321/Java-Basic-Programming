package arrays;
import java.util.Scanner;
public class VoCoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	String str=s.next();
	Carnew c=new Carnew(str);
	Carnew.a();
	Carnew.b();
	Carnew.m();
	Carnew.disply(str);
	
	}

}
class Carnew 
{
	String str;
	public Carnew(String str)
	{
	str=str;	
	}
	public static void disply(String str2) {
		// TODO Auto-generated method stub
		
	}
	public static void m()
	{
		System.out.println("Welcome car m");
		System.out.println("Welcome car model no. is 1234");
	}
	public static void b()
	{
		System.out.println("Welcome car b");
		System.out.println("Welcome car model no. is 4321");
	}
	public static void a()
	{
		System.out.println("Welcome car a");
		System.out.println("Welcome car model no. is 3231");
	}
}