package guvi;
import java.util.Scanner;
public class ass12 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b,c,sum=0;
	c=a;
	while(a!=0){
		b=a%10;
		sum=(sum*10)+b;
		a=a/10;
	}
	if(c==sum){
		System.out.println("Palindrome");
	}
	else{
		System.out.println("Not Palindrome");
	}
}
}
