package pra;
import java.util.Scanner;
public class ass17 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b,c=a,sum=0;
    while(c!=0){
    	b=c%10;
    	sum=sum+(b*b*b);
    	c=c/10;
    }
    if(sum==a){
    	System.out.println("Armstrong number");
    }
    else{
    	System.out.println("Not Armstrong number");
    }
}
}
