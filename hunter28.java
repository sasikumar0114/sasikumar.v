package guvihunter;

import java.util.Scanner;

public class hunter28 {
public static void main(String[] args) {
	System.out.println("Enter the string:");
	Scanner scanner=new Scanner(System.in);
	String a=scanner.nextLine();
	char[] b=a.toCharArray();
	for(int i=0;i<a.length();i++) {
		for(int j=i+1;j<a.length();j++) {
			if(b[i]==b[j]) {
				b[j]=0;
			}
		}
	}
	String ans="";
	for(int k=0;k<b.length;k++) {
		if(b[k]!=0)
			ans+=b[k];
	}
	System.out.println(ans);
}
}
