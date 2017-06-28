package sasi1;
import java.util.*;
public class hunter48 {
public static void main(String[] args) {
	System.out.println("String1:");
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	System.out.println("String2:");
	String b=s.nextLine();
	if(a.contains(b)){
		int c=a.indexOf(b);
		System.out.println(c);
	}
	else{
		System.out.println("Output:-1");
	}
}
}
