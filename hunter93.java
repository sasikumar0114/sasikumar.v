package guvihunter;

import java.util.Scanner;

public class hunter93 {
public static void main(String[] args) {
	System.out.println("Enter the Word:");
	Scanner scanner=new  Scanner(System.in);
	String input=scanner.nextLine();
	String input1[]=input.split(" ");
	String output="";
	for(int i=0;i<input1.length;i++) {
		StringBuffer buffer=new StringBuffer(input1[i]);
		buffer.reverse();
		String as=buffer.toString();
		char[] c=input1[i].toCharArray();
		char[] c1=as.toCharArray();
		String ase="";
		for(int j=0;j<c.length;j++) {
			if(Character.isUpperCase(c[j])) {
				c1[j]=Character.toUpperCase(c1[j]);
			}
			if(Character.isLowerCase(c[j])) {
				c1[j]=Character.toLowerCase(c1[j]);
			}
			ase+=c1[j];
		}
		output+=ase;
		output+=" ";
	}
	System.out.println(output);
}
}
