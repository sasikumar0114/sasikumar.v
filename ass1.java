package guvi;
import java.util.Scanner;
public class ass1 {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner scan=new Scanner(System.in);
	char a=scan.next().charAt(0);
	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
		System.out.println("Enter number "+a+" is Vowel");
		
	}
	else{
		System.out.println("Enter number "+a+" is consonant");
	}
}
}
