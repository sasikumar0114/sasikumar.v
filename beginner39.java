package guvibeginner;
import java.util.Arrays;
import java.util.Scanner;
public class beginner39 {
public static void main(String[] args) {
	System.out.println("Enter the 10 numbers:");
	Scanner s=new Scanner(System.in);
	int a[]=new int[10];
	for(int i=0;i<10;i++){
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	System.out.println("The greatest number is "+a[9]);
}
}
