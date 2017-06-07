package pra;
import java.util.Scanner;
import pra.ass2;
public class ass11 {
public static void main(String[] args) {
	System.out.println("Enter the base value:");
	Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	System.out.println("Enter the power value:");
	int p=s.nextInt();
	int c=b;
	for(int i=2;i<=p;i++){
		c=c*b;
	}
System.out.println(c);

}
}
