package sasi1;
import java.util.Scanner;
public class hunter67 {
public static void main(String[] args) {
	System.out.println("Enter the 1st Student details:");
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
    int a1[]=new int[3];
    int tol1=0,tol2=0;
    for(int i=0;i<3;i++){
    	a1[i]=s.nextInt();
    	tol1+=a1[i];
    }
    System.out.println("Enter the 2nd student details:");
    String b=s.next();
    int a2[]=new int[3];
    for(int j=0;j<3;j++){
    	a2[j]=s.nextInt();
    	tol2+=a2[j];
    }
    if(tol1>tol2){
    	System.out.println(a);
    }
    else if(tol2>tol1){
    	System.out.println(b);
    }
    else{
    	System.out.println(a+" and "+b+" got same score.");
    }
}
}
