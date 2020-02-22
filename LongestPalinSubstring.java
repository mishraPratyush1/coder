package chapter3;
public class LongestPalinSubstring 
{ 
	// This function prints the longest palindrome substring 
	// (LPS) of str[]. It also returns the length of the 
	// longest palindrome 
	static int longestPalSubstr(String str) { 
		int max = 1; //  (length of LPS) 

		int start = 0; 
		int len = str.length(); 

		int l, h; 

		// One by one consider every character as center 
		// point of even and length palindrome. 
		for (int i = 1; i < len; ++i) 
		{ 
			// Find the longest even length palindrome with 
			// center points as i-1 and i. 
			l = i - 1; 
			h = i; 
			while (l >= 0 && h < len && str.charAt(l) == str.charAt(h)) 
			{ 
				if (h - l + 1 > max) 
				{ 
					start = l; 
					max = h - l + 1; 
				} 
				--l; 
				++h; 
			} 

			// longest odd length palindrome 
			l = i - 1; 
			h = i + 1; 
			while (l >= 0 && h < len && str.charAt(l) == str.charAt(h)) { 
				if (h - l + 1 > max) { 
					start = l; 
					max = h - l + 1; 
				} 
				--l; 
				++h; 
			} 
		} 

		System.out.print("Longest palindrome substring is: "); 
		System.out.println(str.substring(start, start + max));
		

		return max; 
	} 

	public static void main(String[] args) { 
		
		String str = "forgeeksskeegfor"; 
		System.out.println("Length is: " + longestPalSubstr(str)); 
	} 

} 

