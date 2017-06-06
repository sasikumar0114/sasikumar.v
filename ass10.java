package guvi;
import java.util.Scanner;
public class ass10 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int count=0;
	while(a!=0){
		a=a/10;
		count++;
	}
	System.out.println(count);
}
}
