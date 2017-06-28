package sasi1;
import java.util.Scanner;
public class player2 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int fact=1;
	for(int i=1;i<=a;i++){
		fact=fact*i;
	}
	System.out.println(fact);
}
}
