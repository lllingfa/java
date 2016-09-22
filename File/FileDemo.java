package File;
import java.io.*;
/*File类常见方法：
 * 1.创建
 *  boolean createNewFile():在指定位置创建文件，如果已经创建，
 *   boolean	mkdir() :创建文件夹
 *   boolean	mkdirs() ：创建多级文件夹
 * 2.删除
 *  boolean	delete() 删除失败返回false
 *   void deleteOnExit() 在程序退出时删除指定文件
 * 3.判断
 * boolean	exists():文件是否存在
 * boolean	isFile() 
 * boolean	isDirectory()
 * boolean	isAbsolute() 
 * 4.获取信息
 *  String	getName() 
 *  String	getParent() 
 *  String	getPath() 
 *  String	getAbsolutePath() 
 *  long	lastModified() 
 *  long	length() 
 * 
 * 2.static File[]	listRoots() */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//consMethod();
		//method_1();
		method_2();
		method_3();
		method_4();
		method_5();
		
	}
	
	public static void method_5(){
		File f1=new File("D:\\Users\\workspace\\File\\file.txt");
		File f2=new File("D:\\Users\\workspace\\File\\file1.txt");
		sop("rename:"+f1.renameTo(f2));
		//类似移动
				
		}
	public static void method_4(){
		
		File f=new File("D:\\Users\\workspace\\File\\src\\File\\file.txt");
		sop("path:"+f.getPath());
		sop("abspath:"+f.getAbsolutePath());
		sop("parent:"+f.getParent());//该方法返回的是绝对路径中的文件的父目录，如果相对路径，返回空
		//如果相对路径中有目录，有上一次层目录，有结果
	}
	public static void method_3(){
		File f=new File("D:\\Users\\workspace\\File\\src\\File\\file.txt");
		//判断是否是文件或者目的时，必须判断是否存在
		f.mkdir();
		sop("dir:"+f.isDirectory());
		sop("file:"+f.isFile());
	   sop(f.isAbsolute());
	}
	public static void method_2(){
		File f=new File("D:\\Users\\workspace\\File\\src\\File\\file.txt");
		sop("execute:"+f.canExecute());
		
		sop("exists:"+f.exists());
		//创建目录1级
		File dir=new File("D:\\Users\\workspace\\File\\src\\File\\abc");
		sop("mkdir:"+dir.mkdir());
	}
	public static void method_1() throws IOException{
		File f=new File("D:\\Users\\workspace\\File\\src\\File\\file.txt");
		sop("create:"+f.createNewFile());
		sop("delete:"+f.delete());
		f.deleteOnExit();
	}
	//创建File对象
	public static void consMethod(){
		//将a.txt封装成file对象。可以将已有的和未出现的文件或者文件夹封装成对象
		File f1=new File("D:\\Users\\workspace\\File\\src\\File\\a.txt");
		File f2=new File("D:\\Users\\workspace\\File\\src\\File","b.txt");
		File d=new File("D:\\Users\\workspace\\File\\src\\File");
	    File f3=new File(d,"c.txt");
	    File f4=new File("D:"+File.separator+"Users"+File.separator+"workspace"+File.separator+"File"+File.separator+"src"+File.separator+"File"+File.separator+"a.txt");
	    //\\和/效果一样，目录分隔符
	    sop("f1:"+f1);
	    sop("f2:"+f2);
	    sop("f3:"+f3);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
