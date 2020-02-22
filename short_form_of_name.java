package chapter3;
import java.util.*;
public class short_form_of_name {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:\n");
		String s=sc.nextLine();
		String  k="";
		int p=0;
		System.out.print((Character.toUpperCase(s.charAt(0)))+".");
		for (int i = s.length()-1; i >=0; i--) 
		{
			if(s.charAt(i)==' ')
			{
				k=s.substring(i);
				p=i;
				break;
			}
		}
		for (int i = 1; i < p ; i++) 
		{
			if(s.charAt(i)==' ')
			{
				System.out.print(s.charAt(i+1)+".");
			}
		}
		
		System.out.print(k);
		
		
		sc.close();

	}

}
