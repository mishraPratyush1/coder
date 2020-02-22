package chapter3;
import java.util.*;
public class make_words_5_characters_long {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the String: ");
		String s=sc.nextLine();
        s=s.replace(" ", "");
		char a[]=s.toCharArray();
		sc.close();
		int len=a.length;
		for (int i = 0; i < len; i++) 
		{
			if(i%5!=4)
				System.out.print(a[i]);
			else
				System.out.print(a[i]+" ");
			
		}
		
		

	}

}
