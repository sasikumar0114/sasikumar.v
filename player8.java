package sasi1;
import java.io.FilterInputStream;
import java.util.*;
public class player8 {
	public static void main(String[] args) 
	{
	  System.out.println("Enter the String:");
	   Scanner s=new Scanner(System.in);
       String a=s.nextLine();
       String b[]=a.split("\\s");
       for(int i=0;i<b.length;i++){
    	   char p=b[i].charAt(0);
    	   String l=Character.toString(p);
    	   l=l.toUpperCase();
    	   b[i]=b[i].toLowerCase();
    	   String k=l+b[i].substring(1, b[i].length()); 
           System.out.print(k);
       }
	}
}
