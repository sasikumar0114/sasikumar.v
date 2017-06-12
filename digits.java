package pra;
import java.util.*;
import java.util.Arrays;
public class digits {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("Enter the removal digits:");
	int k=s.nextInt();
	int b=n,g=n,i=0;
	while(g!=0){
		i++;
		g=g/10;
	}
	int[] c=new int[i];
	int p=0;
	while(b!=0){
		c[p]=b%10;
		b=b/10;
		p++;
	}
	Arrays.sort(c);
	for(int l=0;l<(i-k);l++){
		System.out.print(c[l]);
	}
}
}
