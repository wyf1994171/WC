package wc;

//对应-s参数
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Traversal {
	public static void read(String fileDir,String[] orders) throws IOException {
		List<File> fileList=new ArrayList<File>();
		//System.out.println(file1.getName());
		//System.out.println(file1.getPath());
		File file =new File(fileDir);
        File[] files = file.listFiles();// 获取目录下的所有文件或文件夹  
        if (files == null) {// 如果目录为空，直接退出  
            return;  
        }  
        // 遍历，目录下的所有文件  
        for (File f : files) {  
            if (f.isFile()&&f.getName().matches("^[\\w.]*\\.c$")) {//递归处理所有.c文件  
                fileList.add(f);  
            } else if (f.isDirectory()) {  
                //System.out.println(f.getAbsolutePath());  
                read(f.getAbsolutePath(),orders);  
            }  
        }  
        for (File f1 : fileList) {  
        	for(String order:orders) {
        		BasicCount a=new BasicCount();
        		if(order.equals("-s")){
        		}
        		else if(order.equals("-c")) {
        			//此处调用字符数统计函数
   
        			
        			System.out.println("文件："+f1.getName());
        			a.count(f1.getAbsolutePath());
        			System.out.println("字符数:"+a.getCharacterNumber());
        		}
        		else if(order.equals("-w")) {
        			//此处调用单词数统计函数
        			System.out.println("文件："+f1.getName());
        			a.count(f1.getName());
        			System.out.println("单词数:"+a.getWordNumber());
        		}
        		else if(order.equals("-l")) {
        			//此处调用行数统计函数
        			System.out.println("文件："+f1.getName());
        			a.count(f1.getName());
        			System.out.println("行数:"+a.getLineNumber());
        		}
        		else if(order.equals("-a")) {
        			//此处调用Check类的checkMore()方法
        			Check.checkMore(f1);
        		}
        	}
           // System.out.println(f1.getName());//接口调用时更改为统计方法  
        }  
	}
}
