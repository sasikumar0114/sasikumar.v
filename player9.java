package sasi1;
import java.util.*;
public class player9 {
public static void main(String[] args) {
	System.out.println("Enter the range:");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	for(int i=a;i<=b;i++){
		int m=i/2,flag=0;
		for(int j=2;j<=m;j++){
			if(i%j==0){
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println(i);
		}
	}
}
}
