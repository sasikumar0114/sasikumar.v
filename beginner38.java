package guvibeginner;
import java.util.Arrays;
import java.util.Scanner;
public class beginner38 {
public static void main(String[] args) {
	System.out.println("Enter the 3 numbers:");
	Scanner s=new Scanner(System.in);
	int a[]=new int[3];
	for(int i=0;i<3;i++){
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	System.out.println("The greatest number is "+a[2]);
}
}
