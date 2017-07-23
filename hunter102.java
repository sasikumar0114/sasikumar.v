package guvihunter;

import java.util.Scanner;

public class hunter102 {
public static void main(String[] args) {
	System.out.println("Enter the input:");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	int sum=0;
	if(a>9) {
		String b=String.valueOf(a);
		int a1[]=new int[b.length()];
		int a2[]=new int[b.length()];
		int c=a,l=0;
		while(c!=0) {
			a1[l]=c%10;
			c=c/10;
			l++;
		}
		l=l-1;
		for(int t=0;t<b.length();t++) {
			a2[t]=a1[l];
			l--;
		}
	    for(int i=0;i<a2.length;i++) {
	    	int s1=0;
	    for(int j=0;j<i+1;j++) {
	    	s1+=a2[j];
	    }
	    sum+=s1;
	    }
	    System.out.println(sum);
	}
	}
}
