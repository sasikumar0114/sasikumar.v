package sasi1;
import java.util.Scanner;
public class player12 {
public static void main(String[] args) {
	System.out.println("Enter the no of element in array:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("Enter the array:");
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	System.out.println("Enter the k value:");
	int k=s.nextInt();
	int b[]=new int[n];
	int f=n-k;
	int p = 0;
	for(int i=f;i<n;i++){
		b[p]=a[i];
		++p;
	}
	for(int j=0;j<f;j++){
		b[p]=a[j];
		++p;
	}
	for(int i=0;i<n;i++){
	System.out.println(b[i]);	
	}
}
}
