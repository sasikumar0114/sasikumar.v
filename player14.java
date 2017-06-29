package sasi1;
import java.util.Scanner;
public class player14 {
public static void main(String[] args) {
	System.out.println("Enter the String:");
	Scanner s=new Scanner(System.in);
	String a=s.next();
	StringBuffer b=new StringBuffer(a);
	b=b.reverse();
	a=b.toString();
	System.out.println(a);
	char c[]=a.toCharArray();
	String d="";
	for(int i=0;i<a.length();i++){
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||
				c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
			
		}
		else{
			String k=Character.toString(c[i]);
			d=d.concat(k);
		}
	}
	System.out.println(d);
}
}
