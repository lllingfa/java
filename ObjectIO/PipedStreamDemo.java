package ObjectIO;
import java.io.*;
class Read implements Runnable{
	private PipedInputStream in;
	Read(PipedInputStream in){
		this.in=in;
	}
	public void run(){
		
			try{
				byte[] buf=new byte[1024];
				System.out.println("��ȡǰ����û����������");
				int len=in.read(buf);
				System.out.println("��ȡ���ݡ�����������");
				String s=new String(buf,0,len);
				System.out.println(s);
				in.close();
			
		}
		catch(IOException e){
			throw new RuntimeException("�ܵ���ȡ��ʧ��");
		}
	}
}
class Write implements Runnable{
	private PipedOutputStream out;
	Write(PipedOutputStream out){
		this.out=out;
	}
	public void run(){
		try{
			System.out.println("��ʼд�����ݣ��ȴ�6��󡣡�");
			Thread.sleep(6000);
			out.write("piped come".getBytes());
			out.close();
		}
		catch(Exception e){
			throw new RuntimeException("�ܵ������ʧ��");
		}
			
		
	}
}

public class PipedStreamDemo {
	public static void main(String[] args) throws IOException{
		
		PipedInputStream in=new PipedInputStream();
		PipedOutputStream out=new PipedOutputStream();
		in.connect(out);
		Read r=new Read(in);
		Write w=new Write(out);
		new Thread(r).start();
		new Thread(w).start();
	}
}

