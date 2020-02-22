package chapter3;
import java.util.*;
public class swap_strings {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string:\n");
		String s=sc.nextLine();
		System.out.println("enter the secong string:\n");
		String s1=sc.nextLine();
		swap(s,s1);
		sc.close();

	}
	public static void swap(String s,String s1)
	{
		String temp=s;
		s=s1;
		s1=temp;
		
		System.out.println(s+" "+s1);
	}

}
