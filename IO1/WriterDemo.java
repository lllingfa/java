package IO;

import java.io.*;

/*字符流和字节流
 * 字节流两个基类：
 * InputStream outputStream
 * 字符流：
 * Reader Writer
 * 先学习下字符流：
 * 既然IO流是用于操作数据的
 * 那么数据的最常见体现形式是：文件
 * 那么先以操作文件为主来演示
 * 需求：在硬盘上，创建一个文件并写入一些文字数据
 * 找到一个专门用于操作文件的Writer子类的对象FileWriter，
 * 后缀名是父类名，前缀名是该流对象的功能
 * IO异常的处理方式*/
public class WriterDemo {
	public static void main(String[] args) throws IOException{
		//创建一个FIleWriter的对象，该对象已初始化就必须要明确备操作的文件
		//如果目录下有同名文件会覆盖
		FileWriter fw=new FileWriter("D:\\Users\\workspace\\System\\src\\IO\\demo.txt");
	    //调用write方法，将字符串写入到流中
		fw.write("shduiah");
		//刷新流对象中的缓冲中数据，放到目的地中
	    fw.flush();
	    fw.write("skhfia");
	    //关闭流资源，但是关闭之前会刷新一次内部的缓冲中的数据。
	    //将数据刷到目的地，flush刷新后流可以继续使用，close刷新后将流关闭
	    fw.close();
	
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
