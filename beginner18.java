package guvibeginner;
import java.util.Scanner;
public class beginner18 {
public static void main(String[] args) {
	System.out.println("Enter the intervel:");
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    for(int i=a;i<=b;i++){
    	int c=i,d=0,e;
    	while(c!=0){
    		e=c%10;
    		d=d+(e*e*e);
    		c=c/10;;
    	}
    	if(i==d){
    		System.out.println(i);
    	}
    }
}
}
