package gitup;
import java.util.Scanner;
public class ass1 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	if(a==0){
		System.out.println("Given number is Zero");
	}
	else if(a<0){
		System.out.println("Given number is Negative");
		}
	else{
		System.out.println("Given number is Positive");
	}
}
}
