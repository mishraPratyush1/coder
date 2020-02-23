package chapter3;
import java.util.*;
public class uppercase_check {

	public static void main(String[] args) 
	{
		//Capitalize the first character
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char q=s.charAt(0);
		q-=(char)('a'-'A');
		System.out.println(q+s.substring(1));
		sc.close();

	}

}
