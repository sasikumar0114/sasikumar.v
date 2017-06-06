package guvi;
import java.util.Scanner;
public class ass8 {
public static void main(String[] args) {
	System.out.println("Enter the n number:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int b;
	b=(n*(n+1))/2;
	System.out.println(b);
}
}
