package guvihunter;

import java.util.Scanner;

public class hunter123 {
public static void main(String[] args) {
	System.out.println("Enter the String:");
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	char b[]=a.toCharArray();
	int p=0;
	for(int i=0;i<b.length;i++){
		for(int j=i+1;j<b.length;j++){
			if(b[i]==b[j]){
				++p;
				b[j]='\0';
			}
			if(j==b.length-1){
				if(p!=0){
					b[i]='\0';
					p=0;
				}
			}
		}
	}
	String l="";
	for(int k=0;k<b.length;k++){
		if(b[k]!='\0')
			l+=b[k];
	}
	System.out.println(l);
	
}
}
