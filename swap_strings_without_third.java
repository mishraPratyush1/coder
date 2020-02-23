package chapter3;
import java.util.*;
public class swap_strings_without_third {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings:\n");
		String a=sc.next();
		String b=sc.next();
		System.out.println("before sorting:\n");
		System.out.println(a+" "+b);
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("\nafter sorting:\n");
		System.out.println(a+" "+b);
		sc.close();

	}

}
