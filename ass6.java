package guvi;
import java.util.Scanner;
public class ass6 {
public static void main(String[] args) {
   System.out.println("Enter the year");
   Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   if((a%4==0&a%100!=0)|(a%400==0)){
	   System.out.println("leap year");
   }
   else{
	   System.out.println("Not leap year");
   }
}
}
