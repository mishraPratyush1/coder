package chapter3;
import java.util.*;
public class highest_occurence_of_a_character {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String!!!! ");
		String name=sc.next();
		char s=returned(name);
//		System.out.println(s);
		
	}
	static char  returned(String s)
	{
		char c;
		int count=0,max=0,k=0;
		int a[]=new int[10];
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if (s.charAt(j)==s.charAt(i)) 
				{
					count++;
				}
				
			}
			a[k++]=count;
			count=0;
		}
		Arrays.toString(a);
		System.out.println(a);
		
		
		return c='9';
	}

}
