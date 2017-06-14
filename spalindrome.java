package pra;
import java.util.*;
public class spalindrome {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=a,c=0,d,e=0;
	while(b!=0){
		d=b%10;
		c=c+d;
		b=b/10;
	}
	a=c;
	while(a!=0){
		d=a%10;
		e=(e*10)+d;
		a=a/10;
	}
	if(c==e){
		System.out.println("Palindrome");
	}
	else{
		System.out.println("Not palindrome");
	}
}
}
