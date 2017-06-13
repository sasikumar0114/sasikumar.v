package pra;
import java.util.*;
public class seed {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	int b=i,c=0,sum=i;
	while(b!=0){
		c=b%10;
		sum=sum*c;
		b=b/10;
	}
	System.out.println("Seed number is "+sum);
}
}
