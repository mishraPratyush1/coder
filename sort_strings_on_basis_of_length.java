package chapter3;
import java.util.*;
public class sort_strings_on_basis_of_length {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:\n");
		String s=sc.nextLine();
		int c=0;
		String del="[ ]+";
		String k[]=s.split(del);
		for (int i = 0; i < k.length; i++) {
			for (int j = i+1; j < k.length; j++) {
				if(k[i].length()>k[j].length())
				{
					String temp=k[i];
					k[i]=k[j];
					k[j]=temp;
				}
			}
		}
		System.out.println("ascending order:\n");
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]+" "+k[i].length());
		}
		
		

		sc.close();
	}

}
