package pra;
import java.util.*;
public class tallest {
public static void main(String[] args) {
	System.out.println("Enter the height of 50 student:");
	Scanner s=new Scanner(System.in);
	int a[]=new int[50];
	for(int i=0;i<50;i++){
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	System.out.println("Enter the k value:");
	int b=s.nextInt();
	System.out.println("4th tallest student height is:"+a[3]);
    System.out.println(b+"th tallent student height is:"+a[b]);
    }
}
