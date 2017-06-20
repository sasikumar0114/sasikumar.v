package pra;
import java.util.*;
public class pri {
public static void main(String[] args) {
	int i=1;
	int c=0;
	do{
		int m=i/2;
		int flag=0;
		for(int j=2;j<=m;j++){
			if(i%j==0){
				flag++;
				break;
			}
		}
		if(flag==0){
			int a,b;
			c=0;
			b=i;
			while(b!=0){
				a=b%10;
				c=c+a;
				b=b/10;
			}
			if(c<=100){
				System.out.println(i);
			}
		}
		flag=0;
		i++;
	}while(c<=100);
}
}
