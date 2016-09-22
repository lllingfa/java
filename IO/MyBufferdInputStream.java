package IO;
import java.io.*;
class MyBufferdInputStream1{
	InputStream in;
	private byte[] buf=new byte[1024];
	private int pos=0,count=0;
	MyBufferdInputStream1(InputStream in){
		this.in=in;
	}
	//һ�ζ�һ���ֽڣ��ӻ��������ֽ����飩��ȡ
	//int����
	public int myRead() throws IOException
	{
		//ͨ��in�����ȡӲ���ϵ����ݣ����洢�ڻ�������
		//ȡ���ٶ�
		if(count==0){
			//��count��¼����
			count=in.read(buf);
			//�ڶ���װ����
			if(count<0)
				return -1;
			pos=0;
			byte b=buf[pos];
			count--;
			pos++;
			return b&255;
		}
		else if(count>0){
			byte b=buf[pos];
			count--;
			pos++;
			return b&255;
		}
		return -1;
	}
	public void  myClose()throws IOException{
		in.close();
	}
}
public class MyBufferdInputStream {
	public static void main(String[] args) throws IOException, InterruptedException {
		long start=System.currentTimeMillis();
		copy_1();
		long end=System.currentTimeMillis();
		System.out.println((end-start)+"ms");
		}
	public static void copy_1() throws IOException, InterruptedException{
		MyBufferdInputStream1 bufis=new MyBufferdInputStream1(new FileInputStream("D:\\Users\\admin\\workspace\\IO\\chuanqi.mp3"));
		BufferedOutputStream bufos=new BufferedOutputStream(new FileOutputStream("D:\\Users\\admin\\workspace\\IO\\chuanqi2.mp3"));
	    int by=0;
	    while((by=bufis.myRead())!=-1){
	    	//write��ǿת
	    	bufos.write(by);
	    }
	  bufis.myClose();
	  bufos.close();
	
	
	}
	}
