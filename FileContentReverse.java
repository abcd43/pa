//S7_Q2
import java.io.*;
public class FileContentReverse
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin = new FileInputStream("sample.txt");
			String str = "";
			int ch;
			
		
			while((ch = fin.read()) != -1)
			{
				//System.out.print(ch);
				str += (char)(ch);
			}//Reverser File Content

			StringBuffer sbf = new StringBuffer(str);
			System.out.println("\nOriginal Content of File:\n"+sbf);			
			System.out.println("\nReverse File Content: \n"+ sbf.reverse());
			System.out.println("\nOriginal File Content in UppperCase:"+str.toUpperCase());
			fin.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
