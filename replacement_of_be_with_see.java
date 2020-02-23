package chapter3;
import java.util.*;
public class replacement_of_be_with_see {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:\n");
		String s=sc.nextLine();
		s=s.toLowerCase();
		StringBuffer obj=new StringBuffer(s);
		obj.append(" ");
		for (int i = 0; i < obj.length()-2 ; i++) {
			if((obj.charAt(i)==' ' && obj.charAt(i+1)=='b' && obj.charAt(i+2)=='e'))
			{
				obj.replace(i+1, i+3, "see");
				i+=2;
				
			}
		}
		System.out.println(obj);
		sc.close();
		
		

	}

}
