package wc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class BasicCount {

	private int characterNumber;//字符数
	private int wordNumber;//单词数
	private int lineNumber;//行数

	public BasicCount()
	{
		characterNumber=0;
		wordNumber=0;
		lineNumber=0;
	}
	public void count(String fileName)throws IOException
	{
		
		BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
		
		 while(br.read()!=-1)
		{
			String s=br.readLine();
			characterNumber+=s.length();
		    wordNumber+=getLineWord(s);
			lineNumber++;
		}
		br.close();
		return;
	}
	public static int getLineWord(String s)
	{
		int w=0;
		for(int i=0;i<s.length();i++)
		{
			s.charAt(i);
			if ((s.charAt(i) >= 'a'&&s.charAt(i) <= 'z') || (s.charAt(i) >= 'A'&&s.charAt(i) <= 'Z'))
			{
				while (i<s.length()&&((s.charAt(i) >= 'a'&&s.charAt(i) <= 'z') || (s.charAt(i) >= 'A'&&s.charAt(i) <= 'Z') || (s.charAt(i)>= '0'&&s.charAt(i)<= '9') || s.charAt(i) == '_'))
				{
					i++;
				}
				w++;
			}
		}
		return w;
	
	}
   public int getCharacterNumber()
   {
	   return characterNumber;
   }
   public int getWordNumber()

   {
	   return wordNumber;
   }
   public int getLineNumber()
   {
	   return lineNumber;
   }
}
