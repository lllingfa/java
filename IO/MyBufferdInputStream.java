package IO;
import java.io.*;
class MyBufferdInputStream1{
	InputStream in;
	private byte[] buf=new byte[1024];
	private int pos=0,count=0;
	MyBufferdInputStream1(InputStream in){
		this.in=in;
	}
	//一次读一个字节，从缓冲区（字节数组）获取
	//int提升
	public int myRead() throws IOException
	{
		//通过in对象读取硬盘上的数据，并存储在缓冲区中
		//取光再读
		if(count==0){
			//用count记录个数
			count=in.read(buf);
			//第二次装归零
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
	    	//write会强转
	    	bufos.write(by);
	    }
	  bufis.myClose();
	  bufos.close();
	
	
	}
	}
