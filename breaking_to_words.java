package chapter3;
import java.lang.*;
import java.util.*;
public class breaking_to_words {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		/*next() can read the input only till 
		 * the space. It can't read two words separated by space. 
		 * Also, next() places the cursor in the same line after reading the input. 
		 * nextLine() reads input including space between the words 
		 * (that is, it reads till the end of line n).
		 */
		StringTokenizer q=new StringTokenizer(s,",_");	//same as strtok in c
		while (q.hasMoreTokens()) //returns a boolean value if 
								 //Tests if there are more tokens available from this tokenizer's string.
		{
			System.out.println(q.nextToken());
			
		}
		//THERE IS SLIGHT DIIFERENCE BETWEEN HASMORETOKENS AND HASMOREELEMENTS
		while (q.hasMoreElements()) {
			System.out.println(q.nextElement());
			
		}
		sc.close();
		

	}

}
