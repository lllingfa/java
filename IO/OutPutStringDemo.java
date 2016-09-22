package IO;
/*字符流：
 * FileReader
 * FileWriter
 * BufferedReader
 * BufferedWriter
 * 字节流
 * InputStream OutputStream
 * 需求：想要操作图片数据，这时就要用到字节流
 * 
 * */
import java.io.*;
public class OutPutStringDemo {
	 public static void main(String[] args) throws IOException{
		 writeFile();
		 readFile_2();
		 readFile_3();
	 }
	 public static void readFile_3() throws IOException{
		 FileInputStream fis=new FileInputStream("fos.txt");
		 int num=fis.available();//建一个刚刚好的缓冲区
		 byte[] buf=new byte[fis.available()];
		 System.out.println("num="+num);
		 fis.read(buf);
		 System.out.println(new String(buf));
		 fis.close();
	 }
	 public static void readFile_2() throws IOException{
		 FileInputStream fis=new FileInputStream("fos.txt");
		 byte[] buf=new byte[1024];
		 //建一个刚刚好的缓冲区
		 //byte[] buf=new byte[fis.available()];
		 int len=0;
		 while((len=fis.read(buf))!=-1){
			 System.out.println(new String(buf,0,len));
		 }
		 fis.close();
	 }
	 public static void readFile_1() throws IOException{
		 FileInputStream fis=new FileInputStream("fos.txt");
		 int ch=0;
		 while((ch=fis.read())!=-1){
			 System.out.print((char)ch);
		 }
		 fis.close();
	 }
	 public static void writeFile() throws IOException{
		 FileOutputStream fos=new FileOutputStream("fos.txt");
		 fos.write("abode".getBytes());
		 fos.close();
		 
	 }
}
