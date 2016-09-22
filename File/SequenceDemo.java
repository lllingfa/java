package File;
import java.util.*;
import java.io.*;
public class SequenceDemo {
	public static void main(String[] args) throws IOException {
		Vector<FileInputStream> v=new Vector<FileInputStream>();
		v.add(new FileInputStream("D:\\Users\\workspace\\File\\src\\File\\a.txt"));
		v.add(new FileInputStream("D:\\Users\\workspace\\File\\src\\File\\file.txt"));
	   Enumeration<FileInputStream> en=v.elements();
	   SequenceInputStream sis=new SequenceInputStream(en);
	   FileOutputStream fos=new FileOutputStream("D:\\Users\\workspace\\File\\src\\File\\hebing.txt");
	   byte[] buf=new byte[1024];
	   int len=0;
	   while((len=sis.read(buf))!=-1){
		   fos.write(buf,0,len);
	   }
	   fos.close();
	   sis.close();
	}
}
