package Presentation;

import java.util.Scanner;

public class det_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1=str.replaceAll("[AEIOUaeiou]", "");
		System.out.println(str1);
	}

}
