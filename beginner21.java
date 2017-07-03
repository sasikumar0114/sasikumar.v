package guvibeginner;
import java.util.Scanner;
public class beginner21 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	if(a==1){
		System.out.println("1");
	}
	if(a==2){
		System.out.println("1 1");
	}
	int b=1,c=1,d;
	if(a>2){
		System.out.print(b+" "+c+" ");
		for(int i=2;i<a;i++){
		d=b+c;
		System.out.print(d+" ");
		b=c;
		c=d;
		}
	}
}
}
