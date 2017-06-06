package guvi;
import java.util.Scanner;
public class ass4 {
public static void main(String[] args) {
	System.out.println("Enter the character:");
	Scanner scan=new Scanner(System.in);
	char a=scan.next().charAt(0);
	if((a>='a'&&a<='z')&&(a>='A'&&a>='Z')){
		System.out.println("Given number is alphabet");
	}
	else{
		System.out.println("Given number is not alphabet");
	}
}
}
