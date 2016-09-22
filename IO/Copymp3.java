package IO;

import java.io.*;

/*演示MP3的复制，通过缓冲区，
 * BufferedOutputStream
 * BufferedInputStreams*/
public class Copymp3 {
	public static void main(String[] args) throws IOException, InterruptedException {
		long start=System.currentTimeMillis();
		copy_1();
		long end=System.currentTimeMillis();
		System.out.println((end-start)+"ms");
	}
	//通过字节流的缓冲区完成复制
	public static void copy_1() throws IOException, InterruptedException{
		BufferedInputStream bufis=new BufferedInputStream(new FileInputStream("D:\\Users\\admin\\workspace\\IO\\chuanqi.mp3"));
		BufferedOutputStream bufos=new BufferedOutputStream(new FileOutputStream("D:\\Users\\admin\\workspace\\IO\\chuanqi1.mp3"));
	    int by=0;
	    while((by=bufis.read())!=-1){
	    	bufos.write(by);
	    }
	  bufis.close();
	  bufos.close();
	
	
	}
}
