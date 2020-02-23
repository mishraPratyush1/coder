package chapter3;
import java.util.*;
public class remove_a_particular_character {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name or the String: ");
		String name=sc.next();
		System.out.println("enter the character which you want to remove from the string::: ");
		char a=sc.next().charAt(0);
		String name1=name.replace(a, ' ');
		System.out.println("new String is:");
		System.out.println(name1.trim());
	}

}
