package IO;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ExceptionInfo {
	public static void main(String[] args) throws IOException{
		try{
			int[] arr=new int[2];
			System.out.println(arr[3]);
		}
		catch(Exception e){
			try{
				//打印日期
				Date d=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String s=sdf.format(d);
				PrintStream ps=new PrintStream("D:\\Users\\workspace\\IO\\exception.log");
			   ps.println(s);
			   System.setOut(ps);
			   
			}
			//e.printStackTrace(new PrintStream("D:\\Users\\admin\\workspace\\IO\\src\\IO\\a.txt"));
		catch(IOException ex){
			throw new RuntimeException("日志文件创建失败");
			
		}
			e.printStackTrace(System.out);
		}
	}
}
//log4j