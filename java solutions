package chapter3;
import java.util.*;
public class check_anagrams {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings: ");
		String a=sc.nextLine();
		char a1[]=a.toCharArray(); //convert to character array
		String b=sc.nextLine();
		char b1[]=b.toCharArray(); //convert to character array
		int p=anagrams(a1,b1);
		if(p==1)
			System.out.println("anagrams");
		else
			System.out.println("not anagrams");
		sc.close();
	}
	static int anagrams(char a1[],char b1[])
	{
		Arrays.sort(a1);
		Arrays.sort(b1);
		if(a1.length!=b1.length)
			System.out.println("not anagrams: ");
		else
			for (int i = 0; i < a1.length; i++) 
			{
				
				if(a1[i]!=b1[i])
					return 0;
				
			}
		return 1;
		
	}

}
