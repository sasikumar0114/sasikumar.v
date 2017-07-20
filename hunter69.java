package guvihunter;

import java.util.Scanner;

public class hunter69 {
public static void main(String[] args) {
	System.out.println("Enter the Email:");
	Scanner scanner=new Scanner(System.in);
	String email=scanner.nextLine();
	int c=0;
		if(email.endsWith("@gmail.com")) {
			int a=email.indexOf('@');
			if(a>=3) {
				System.out.println("Valid");
			    ++c;
			}
		}
		if(c==0) {
			System.out.println("Invalid");
		}
}
}