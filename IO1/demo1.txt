package IO;
import java.io.*;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException{
		//创建一个文件读取流对象，和指定名称的文件相关联
		//保证文件是存在的，如果不存在，会发生 FileNotFoundException
		FileReader fr=new FileReader("D:\\Users\\workspace\\System\\src\\IO\\demo.txt");
		//调用读对象的read方法,read()一次读一个字符，而且会自动往下读
		while(true){
			int ch=fr.read();
			if(ch==-1)
				break;
		sop("ch:"+(char)ch);
		}
		//方法二读的条件,-1为文件尾
		int ch=0;
		while((ch=fr.read())!=-1)
			sop("ch:"+(char)ch);
		
		fr.close();
		//通过字符数组进行读取
		FileReader fr1=new FileReader("D:\\Users\\workspace\\System\\src\\IO\\FileReaderDemo.java");
	    //定义一个字符数组，用于存储读到的字符
		// read(char[] cbuf)返回字符个数
		char[] buf=new char[1024];
		
		int num=0;
		while((num=fr1.read(buf))!=-1)
		sop(new String(buf,0,num));
		fr1.close();
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
