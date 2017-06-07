package pra;
import java.util.Scanner;
public class ass13 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=a/2,c=0;
	for(int i=2;i<=b;i++){
		if(a%i==0){
			System.out.println("Not prime number");
			c=1;
			break;
		}
	}
	if(c==0){
		System.out.println("Prime number");
	}
}
}
