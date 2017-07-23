package guvihunter;

import java.util.Scanner;

public class hunter103 {
public static void main(String[] args) {
	System.out.println("Enter the input:");
	Scanner scanner=new Scanner(System.in);
    int a=scanner.nextInt();
    if(a>9) {
    	String s=String.valueOf(a);
    	int a1[]=new int[s.length()];
    	int a2[]=new int[s.length()];
    	int b=a,l=0;
    	while(b!=0) {
    		a1[l]=b%10;
    		b=b/10;
    		l++;
    	}
    	l=l-1;
    	for(int i=0;i<s.length();i++) {
    		a2[i]=a1[l];
    		--l;
    	}
    	int sum=0;
    	for(int i=1;i<=s.length();i++) {
    		int f=a2[i-1];
    		int r=f;
    		for(int j=1;j<=s.length()-1;j++) {
    			f=f*r;
    		}
    		sum+=f;
    	}
    	System.out.println(sum);
    }
    else{
   System.out.println("Enter the greater than 9");
    }

}
}
