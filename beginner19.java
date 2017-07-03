package guvibeginner;
import java.util.Scanner;
public class beginner19 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int k=1;
	for(int i=1;i<=a;i++){
	    k=k*i;
	}
	System.out.println(k);
}
}
