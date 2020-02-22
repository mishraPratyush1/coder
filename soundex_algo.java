package chapter3;
public class soundex_algo {

	public static void main(String[] args) 
	{
		String[] names = {
				"Darwin", "Ian",
				"David", "Greg",
				"Darwent", "William",
				"Derwin", "Doraemon"
				};
				for (String name : names) 
				{
					System.out.println(Soundex.soundex(name) + ' ' + name);
				}

	}

}

	/*	The Soundex algorithm generates four-character codes based 
	  	upon the pronunciation of English words. 
		These codes can be used to compare two words to determine whether they sound alike. */
class Soundex 
{
static boolean debug = false;

public static final char[] MAP = {

 '0','1','2','3','0','1','2','0','0','2','2','4','5',
//A   B   C   D   E   F   G   H   I   J   K   L   M
 '5','0','1','2','6','2','3','0','1','0','2','0','2'
//N   O   P   W   R   S   T   U   V   W   X   Y   Z
};
public static String soundex(String s) {
	
	String t = s.toUpperCase();
	StringBuffer res = new StringBuffer();
	char c, prev = '?', prevOutput = '?';

	for (int i=0; i<t.length() && res.length() < 4 && (c = t.charAt(i)) != ','; i++) 
	{
		if(c>='A' && c<='Z' && c != prev) 
		{
			prev = c;
		
			if (i==0) 
			{
				res.append(c);
			} 
				else 
				{
					char m = MAP[c-'A'];
					if (debug) 
					{
						System.out.println(c + " --> " + m);
					}
					if (m != '0' && m != prevOutput) 
					{
						res.append(m);
						prevOutput = m;
					}
				}
		}
	}
	if (res.length() == 0)
		return null;
	for (int i=res.length(); i<4; i++)
		res.append('0');
	return res.toString();
	//	toString() method returns the string representation of the object. 
	}
	
}
