package guvihunter;

import java.util.Scanner;

public class hunter68 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int size=scanner.nextInt();
	System.out.println("Enter the Element:");
	int[] arr=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=scanner.nextInt();
	}
	int max=0;
	for(int j=0;j<size-1;j++) {
		int diff=Math.abs(arr[j]-arr[j+1]);
		if(max<diff) {
			max=diff;
		}
	}
	System.out.println("Output:"+max);
}
}
