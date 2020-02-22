package chapter3;
public class use_of_split {

	public static void main(String[] args) {
		String a="name,naew,wewe,sdsda,sdsd";
		String s[]=a.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
