package pra;
import java.util.Scanner;
public class ass16 {
	public static void main(String[] args) {
		System.out.println("Enter the range:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++){
			int c=i/2;
			int d=0;
			for(int j=2;j<=c;j++){
				if(i%2==0){
					d=1;
					break;
				}
			}
			if(d==0){
				System.out.println(i);
			}
		}
	}
}
