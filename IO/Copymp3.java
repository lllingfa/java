package IO;

import java.io.*;

/*��ʾMP3�ĸ��ƣ�ͨ����������
 * BufferedOutputStream
 * BufferedInputStreams*/
public class Copymp3 {
	public static void main(String[] args) throws IOException, InterruptedException {
		long start=System.currentTimeMillis();
		copy_1();
		long end=System.currentTimeMillis();
		System.out.println((end-start)+"ms");
	}
	//ͨ���ֽ����Ļ�������ɸ���
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
