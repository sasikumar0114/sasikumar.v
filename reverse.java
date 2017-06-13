package pra;
import java.util.*;
public class reverse {
public static void main(String[] args) {
	System.out.println("Enter the String:");
	Scanner s=new Scanner(System.in);
	String a=s.next();
	StringBuilder c=new StringBuilder(a);
	c=c.reverse();
	a=c.toString();
	System.out.println(a);
}
}
