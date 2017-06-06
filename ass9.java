package guvi;
import java.util.Scanner;
public class ass9 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int sum=0;
	for(int i=1;i<=a;i++){
		sum=sum+i;
	}
	System.out.println(sum);
}
}
