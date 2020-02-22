package chapter3;
import java.util.*;
public class character_corrections 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Strings: ");
		String a=sc.next();
		String b=sc.next();
		char a1[]=a.toCharArray();
		char b1[]=b.toCharArray();
		int c=0;
		if(a1.length!=b1.length)
			System.out.println("not possible to replace characters as lengths are different..");
		for (int i = 0; i < a1.length; i++) 
		{
			if(a1[i]!=b1[i])
			{
				a1[i]=b1[i];
				c++;
			}
		}
		System.out.println(c +" no of characters are to be replaced...");
	}

}
