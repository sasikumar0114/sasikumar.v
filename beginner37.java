package guvibeginner;
import java.util.Scanner;
public class beginner37 {
public static void main(String[] args) {
	System.out.println("Enter the 2 number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("Before Swapping:"+a+" "+b);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("After Swapping:"+a+" "+b);
}
}
