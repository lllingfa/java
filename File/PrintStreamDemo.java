package File;
import java.io.*;
import java.util.*;
/*打印流：
 * 该流提供了打印方法，可以将各种数据类型的数据都原样打印
 * 字节打印流：
 * PrintStream
 * 构造函数可以接收的参数类型
 * 1.file对象
 * 2.字符串路径
 * 3，字节输出流
 * 字符打印流
 *  1.file对象file
 * 2.字符串路径string
 * 3，字节输出流OutputStream
 * 4.字符输出流 writer
 * PrintWriter
 * */
public class PrintStreamDemo {
	public static void main(String[] args) throws IOException{
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out =new PrintWriter(System.out);
		//FileWriter自动带刷新，不需要over的结束
		PrintWriter out =new PrintWriter(new FileWriter("D:\\Users\\workspace\\File\\src\\File\\a.txt"),true);
		String line=null;
		while((line=bufr.readLine())!=null)
		{if("over".equals(line))
			break;
			out.println(line.toUpperCase());
			//out.flush();
		}
		out.close();
		bufr.close();
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
