package pra;
import java.util.Scanner;
public class ass14 {
public static void main(String[] args) {
System.out.println("Enter the interval reange:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
for(int i=a;i<=b;++i){
	if(i%2!=0){
		System.out.println(i);
	}
}
}
}
