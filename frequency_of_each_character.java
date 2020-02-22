package chapter3;
import java.util.*;
public class frequency_of_each_character {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string\n");
		String s=sc.next();
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			int count=0;
			for (int j = 0; j < c.length; j++) 
			{
				if(j<i && c[i]==c[j])
					break;
				
				if(c[i]==c[j])
					count++;
				
				if(j==c.length-1)
					System.out.println("character "+c[i]+" is present "+count+" times.");
			}
		}
		

	}

}
