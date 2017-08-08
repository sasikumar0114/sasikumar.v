package guvihunter;
import java.util.Scanner;
public class hunter72 {
public static void main(String[] args) {
	System.out.println("Enter the string:");
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	String[] b=a.split("\\s");
	for(int i=0;i<b.length;i++){
		int k=b[i].length();
		if(i%2==0){
			StringBuffer c=new StringBuffer(b[i]);
			c=c.reverse();
			b[i]=c.toString();
		}
	}
	String h="";
	for(int i=0;i<b.length;i++){
		h=h.concat(b[i]);
		h=h.concat(" ");
	}
	System.out.println(h);
}
}
