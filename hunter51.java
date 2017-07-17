package guvihunter;

import java.util.Scanner;

public class hunter51 {
public static void main(String[] args) {
	System.out.println("Enter the string1:");
	Scanner scanner=new Scanner(System.in);
	String a=scanner.next();
	System.out.println("Enter the string2:");
	String b=scanner.next();
	try {
	int a1=Integer.parseInt(a);
	int b1=Integer.parseInt(b);
	int c = 0;
	int i=0;
	if(a1>0&&b1>0) {
		c=a1*b1;
	}
	else {
		System.out.println("Invalid input");
	  ++i;
	}
	String s=String.valueOf(c);
	if(i==0)
	System.out.println(s);
}catch(Exception e) {
	System.out.println(e);
}
}
}
