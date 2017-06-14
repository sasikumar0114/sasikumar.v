package pra;
import java.util.*;
public class bpalindrome {
public static void main(String[] args) {
	System.out.println("Enter the String:");
	Scanner s=new Scanner(System.in);
	String a=s.next();
	StringBuilder b=new StringBuilder(a);
	b=b.reverse();
	int n=0;
	StringBuilder v=b;
	String c=b.toString();
	StringBuilder l;
	String d;
	char ch[]=c.toCharArray();
	for(int i=0;i<ch.length;i++){
		b=v.deleteCharAt(i);
		c=b.toString();
		l=b.reverse();
	    d=l.toString();  
	    if(c.equals(d)){
	    	System.out.println(ch[i]);
	    	n++;
	    	break;
	    }
	    if(n==0){
	    	v=new StringBuilder(a);
	    	v=v.reverse();
	    }
	}
	if(n==0){
		System.out.println("Not possible palindrome");
	}
}
}
