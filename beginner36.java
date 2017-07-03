package guvibeginner;
import java.util.Scanner;
public class beginner36 {
public static void main(String[] args) {
	System.out.println("Enter the numbers:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c;
	System.out.println("Before Swapping:"+a+" "+b);
	c=a;
	a=b;
	b=c;
	System.out.println("After Swapping:"+a+" "+b);
}
}
