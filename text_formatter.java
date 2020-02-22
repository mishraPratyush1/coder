package chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class text_formatter {

	public static final int COLWIDTH=72;
	
	final BufferedReader in;
	
	PrintWriter out;
	
	
	public static void main(String[] av) throws IOException {
	if (av.length == 0)
		new text_formatter(System.in).format();
	else 
			for (String name : av) {
				new text_formatter(name).format();
		}
	}
	public text_formatter(BufferedReader inFile, PrintWriter outFile) {
		this.in = inFile;
		this.out = outFile;
	}
	public text_formatter(PrintWriter out) {
		this(new BufferedReader(new InputStreamReader(System.in)), out);
	}
	
	public text_formatter(BufferedReader file) throws IOException {
		this(file, new PrintWriter(System.out));
	}
	
	public text_formatter(String fname) throws IOException {
		this(new BufferedReader(new FileReader(fname)));
	}
	
	public text_formatter(InputStream file) throws IOException {
		this(new BufferedReader(new InputStreamReader(file)));
	}
	
	public void format() throws IOException {
		String line;
		StringBuilder outBuf = new StringBuilder();
	
	while ((line = in.readLine()) != null) 
	{
		if (line.length() == 0) 
		{
		
			out.println(outBuf);
			
			out.println();
		
			outBuf.setLength(0);
		} 
			else 
			{
			
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) 
				{
					String word = st.nextToken();
				
					if (outBuf.length() + word.length() > COLWIDTH) 
					{
							out.println(outBuf);
							outBuf.setLength(0);
					}
					outBuf.append(word).append(' ');
				}
			}
	}
	if (outBuf.length() > 0) 
	{
		out.println(outBuf);
	} 
	else 
	{
		out.println();
	}
}
}