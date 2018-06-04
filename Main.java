package wc;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {
	public static void main(String[] args) throws IOException
	{	
		for(String order:args) {
			if(order.equals("-s")) {
				File file=new File("");
				Traversal.read(file.getAbsolutePath()+"\\src", args);
				break;
			}
			BasicCount f=new BasicCount();
			if(args[args.length-1].length()!=2&&!args[args.length-1].equals("*.c"))
			{
				f.count(args[args.length-1]);
			}

			if(order.equals("-c")) {
				System.out.println("文件:"+args[args.length-1]);
    			System.out.println("字符数:"+f.getCharacterNumber());
    		}
    		else if(order.equals("-w")) {
    			System.out.println("文件:"+args[args.length-1]);
    			System.out.println("单词数:"+f.getWordNumber());
    		}
    		else if(order.equals("-l")) {
    			System.out.println("文件:"+args[args.length-1]);
    			System.out.println("行数:"+f.getLineNumber());
    		}
    		else if(order.equals("-a")) {
    			Check.checkMore(new File(args[args.length-1]));
    		}
    		else if(order.equals("-x")) {
    			new GUI();
    		}
		}
	}
}
