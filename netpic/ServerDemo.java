import java.io.*;
import java.net.*;
/*��ʾ�ͻ��˺ͷ����
 * 1.�ͻ��ˣ������
 * ����ˣ��Զ���
 * 2
 * �ͻ��ˣ������
 * ����ˣ�Tomcat������*/
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10009);

		Socket s=ss.accept();
		//ֻ�ظ����
		String ip=s.getInetAddress().getHostAddress();
		InputStream in=s.getInputStream();
		byte[] buf=new byte[1024];
		int len=in.read(buf);
		System.out.print(new String(buf,0,len));
		System.out.println(ip+"...connected");
		 PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		 //html���ԣ�������ܽ���
		 
		 //out.println("hello,client");
		out.println("<font color='red' size='7'>hello,client</font>");
		 s.close();
		 ss.close();
	}
}
