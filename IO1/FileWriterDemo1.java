package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
	public static void main(String[] args) throws IOException  {
		//传递一个true，写在数据的尾部
		FileWriter fw=new FileWriter("D:\\Users\\workspace\\System\\src\\IO\\demo.txt",true);
		fw.write("\nshduiah");
		fw.close();
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
