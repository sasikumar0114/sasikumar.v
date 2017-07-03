package guvihunter;
import java.util.Scanner;
public class hunter3 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	int []a=new int[5];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<5;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<5;i++){
		if(i==a[i]){
			System.out.print(a[i]+" ");
		}
	}
}
}
