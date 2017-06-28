package sasi1;
import java.util.*;
public class player3 {
public static void main(String[] args) {
	System.out.println("Enter the Integer:");
	Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	int rev=0,d;
	while(b!=0){
		d=b%10;
		rev=(rev*10)+d;
		b=b/10;
	}
	System.out.println(rev);
}
}
