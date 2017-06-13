package pra;
import java.util.*;
public class target {
public static void main(String[] args) {
	System.out.println("Enter the no of array Element:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("Enter the array:");
	int b[]=new int [n];
	for(int i=0;i<n;i++){
		b[i]=s.nextInt();
	}
	System.out.println("Enter the target:");
	int p=s.nextInt();
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if((b[i]+b[j])==p){
				System.out.println("The number are "+b[i]+","+b[j]);
			}
		}
	}
}
}
