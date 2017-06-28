package sasi1;
import java.util.Scanner;
public class player1 {
public static void main(String[] args) {
	System.out.println("Enter the string:");
	Scanner s=new Scanner(System.in);
	String a=s.next();
	StringBuffer d=new StringBuffer(a);
	d.reverse();
	a=d.toString();
	System.out.println(a);
}
}
