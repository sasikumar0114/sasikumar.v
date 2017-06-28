package sasi1;
import java.util.*;
public class player4 {
public static void main(String[] args) {
	System.out.println("Enter the String:");
	Scanner s=new Scanner(System.in);
	String a=s.next();
	try{
		int b=Integer.parseInt(a);
		System.out.println(b);
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
