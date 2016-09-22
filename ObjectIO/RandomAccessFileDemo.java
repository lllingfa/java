package ObjectIO;
/*RandomAccessFile
 * 该类不是算是IO体系中的子类。
 * 而是直接继承自Object
 * 但是它是IO包中成员，因为它具备读和写功能
 * 内部封装了一个数组，而且通过指针对数组的元素进行操作
 * 可以通过getFilePointer获取指针位置
 * 同时可以通过seek改变指针位置
 * 其实完成读写的原理是内部封装了字节输入流和输出流
 * 通过构造函数可以看出，该类只能操作文件
 * 而且操作文件还有模式：只读r,,读写rw等
 * 如果模式为只读，不会创建文件，回去读取一个已存在的文件，如果没有，则会报错
 * 如果模式为rw，会自动创建文件
 * 而且该对象的构造函数要操作的文件不存在，会自动创建，如果存在不会覆盖
 * */
import java.io.*;
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		 writeFile();
		 writeFile_2();
		 System.out.println(Integer.toBinaryString(97));
		 readFile();
	}
	public static void readFile() throws IOException{
		RandomAccessFile raf=new RandomAccessFile("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\raf.txt","r");
		//调整对象指针
		raf.seek(8*0);
		//跳过指定的字节数,只能往前跳，不能往后跳
		raf.skipBytes(8);
		byte[] buf=new byte[4];
		raf.read(buf);
		String name=new String(buf);
		int age=raf.readInt();
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
	public static void writeFile_2() throws IOException{
		RandomAccessFile raf=new RandomAccessFile("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\raf.txt","rw");
		//随机位置读写
		raf.seek(8*3);
		raf.write("period".getBytes());
		raf.writeInt(103);
		raf.close();
	}
	public static void writeFile() throws IOException{
		RandomAccessFile raf=new RandomAccessFile("D:\\Users\\workspace\\ObjectIO\\src\\ObjectIO\\raf.txt","rw");
		raf.write("lisi".getBytes());
		raf.writeInt(97);
		raf.close();
	}
}
