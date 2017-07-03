package guvibeginner;
import java.util.Scanner;
public class beginner24 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b,c=0;
	while(a!=0){
		b=a%10;
		c=(c*10)+b;
		a=a/10;
	}
	System.out.println(c);
}
}
