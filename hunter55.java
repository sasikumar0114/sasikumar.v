package sasi1;
import java.util.Scanner;
public class hunter55 {
public static void main(String[] args) {
	System.out.println("Enter the no of element in array:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("Enter the array:");
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	System.out.println("Enter the d value:");
	int k=s.nextInt();
    int b[]=new int[n];
    int f=n-k,l=k;
    for(int i=0;i<f;i++){
    	b[i]=a[l];
    	l++;
    }
    int lk=0;
    for(int j=f;j<n;j++){
    	b[j]=a[lk];
    	++lk;
    }
    System.out.println("Output:");
    for(int i=0;i<n;i++){
    	System.out.print(b[i]+" ");	
    	}
}
}
