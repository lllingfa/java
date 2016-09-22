package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*1.将C盘创建一个文件。用于存储C盘文件中的数据
 * 2.定义读取流和C盘文件关联
 * 3.通过不断的读写完成数据存储
 * 4.关闭资源*/
public class CopyText {
	public static void main(String[] args) throws IOException{
		copy1();
		copy2();
		
	}
	public static void copy1()throws IOException{
		//创建目的地
		FileWriter fw=new FileWriter("D:\\Users\\workspace\\System\\src\\IO\\demo2.txt");
		FileReader fr=new FileReader("D:\\Users\\workspace\\System\\src\\IO\\demo.txt");
	    int ch=0;
	    while((ch=fr.read())!=-1){
	    	sop(""+(char)ch);
	    	fw.write((char)ch);
	    }
	    fw.close();
	    fr.close();
	}
	public static void copy2()throws IOException{
		//创建目的地
		FileWriter fw=new FileWriter("D:\\Users\\workspace\\System\\src\\IO\\demo1.txt");
		FileReader fr=new FileReader("D:\\Users\\workspace\\System\\src\\IO\\FileReaderDemo.java");
	    int ch=0;
	   char[] buf=new char[1024];
	
	int num=0;
	while((num=fr.read(buf))!=-1){
	sop(new String(buf,0,num));
	fw.write(buf,0,num);
	    }
	    fw.close();
	    fr.close();
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
