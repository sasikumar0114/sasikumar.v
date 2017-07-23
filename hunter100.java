package guvihunter;

import java.util.Scanner;

public class hunter100 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner scanner=new Scanner(System.in);
	int input=scanner.nextInt();
	int a=input;
	int b=0,c=0,i=0;
	while(a!=0) {
		b=a%10;
		c=(c*10)+b;
		a=a/10;
		++i;
	}
	int as[]=new int[i];
	int j=0;
	while(c!=0) {
		as[j]=c%10;
		c=c/10;
		j++;
	}
	int output=0,m=0;
	for(int k=0;k<as.length;k++) {
		if(k!=as.length-1) {
			m=(int) Math.pow(as[k], as[k+1]);
			output+=m;
		}
		else {
			m=(int) Math.pow(as[k], 0);
			output+=m;
		}
	}
	System.out.println(output);
}
}
