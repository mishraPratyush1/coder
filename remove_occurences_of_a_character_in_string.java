package chapter3;
import java.util.*;
public class remove_occurences_of_a_character_in_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		String k="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=c)
			{
				k+=(s.charAt(i));
			}
		}

		System.out.println(k);
	}

}
