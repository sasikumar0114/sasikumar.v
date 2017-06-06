package guvi;
import java.util.Scanner;
public class ass5 {
public static void main(String[] args) {
System.out.println("Enter the three number:");
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a>b&a>c){
	System.out.println(a+" is greatest number");
}
else if(b>a&b>c){
	System.out.println(b+" is greatest number");
}
else{
	System.out.println(c+" is greatest number");
}
}
}
