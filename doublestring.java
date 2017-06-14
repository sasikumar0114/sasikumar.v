package pra;
import java.util.*;
public class doublestring {
public static void main(String[] args) {
	System.out.println("Enter the string:");
	Scanner s=new Scanner(System.in);
	String a=s.next();
	
	String e,r;
	char c[]=a.toCharArray();
	int n=a.length();
	int q=n/2;
	char k[] = new char[q];
	char p[]=new char[q];
	if(n%2==0){
		for(int i=0;i<n/2;i++){
			k[i]=c[i];
		}
		for(int i=0;i<n/2;i++){
			p[i]=c[q];
			q++;
		}
		e=new String(k);
		r=new String(p);
		if(e.equals(r)){
			System.out.println("Double String");
		}
	}
	else{
		System.out.println("Not Double String");
	}
}
}
